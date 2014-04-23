/**
 * 
 */
package com.biotech.inudstries.web.services.database.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biotech.inudstries.web.services.account.IAuthorizedUser;
import com.biotech.inudstries.web.services.account.IUser;
import com.biotech.inudstries.web.services.account.IUserExtractor;
import com.biotech.inudstries.web.services.database.IDatabaseConfiguration;
import com.biotech.inudstries.web.services.database.IDatabaseLoginConfiguration;
import com.biotech.inudstries.web.services.database.IUserAccountProvider;
import com.biotech.inudstries.web.services.database.IUserTableSchema;
import com.biotech.inudstries.web.services.database.QueryFormats;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Created: Apr 17, 2014
 * 
 * @author Brian Holman
 *
 */
public class UserAccountProvider implements IUserAccountProvider {

	private static transient final Logger LOGGER = LoggerFactory.getLogger(UserAccountProvider.class);

	private final IDatabaseConfiguration database;
	private final IDatabaseLoginConfiguration loginInformation;
	private final IUserTableSchema tableSchema;
	private final IUserExtractor userExtractor;

	private final String SELECT_USER_BY_USERNAME;
	private final String SELECT_USER_BY_USERNAME_AND_PASSWORD;

	/**
	 * @throws Exception
	 * 
	 */
	@Inject
	public UserAccountProvider(
			@Named(WANTED_DATABASE) IDatabaseConfiguration database,
			@Named(WANTED_CREDENTIALS) IDatabaseLoginConfiguration loginInformation,
			IUserTableSchema tableSchema,
			IUserExtractor userExtractor) throws Exception {

		this.database = database;
		this.loginInformation = loginInformation;
		this.tableSchema = tableSchema;
		this.userExtractor = userExtractor;

		this.SELECT_USER_BY_USERNAME = QueryFormats.SELECT_ROW_BY_COLUMN.build(
				database.getDatabaseName(),
				tableSchema.getTableName(),
				tableSchema.getUsernameColumn());
		this.SELECT_USER_BY_USERNAME_AND_PASSWORD = QueryFormats.SELECT_ROW_BY_TWO_COLUMN.build(
				database.getDatabaseName(),
				tableSchema.getTableName(),
				tableSchema.getUsernameColumn(),
				tableSchema.getPasswordColumn());
	}

	private List<Exception> closeAll(AutoCloseable... autoCloseables) {
		List<Exception> exceptions = new ArrayList<>();
		for (AutoCloseable closeable : autoCloseables) {
			Exception e = close(closeable);
			if (e != null) {
				exceptions.add(e);
			}
		}
		return exceptions;
	}

	/**
	 * Closes the parameter and returns an exception instead of throwing it.
	 * 
	 * @param c
	 * @return
	 */
	private Exception close(AutoCloseable c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (Exception e) {
			return e;
		}
		return null;
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserAccountProvider#
	 * getUserByUsername(java.lang.String)
	 */
	@Override
	public IUser getUserByUsername(String username) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		IUser user = null;
		try {
			connection = DriverManager.getConnection(
					database.getConnectionString(),
					loginInformation.getUsername(),
					loginInformation.getPassword());
			statement = connection.prepareStatement(SELECT_USER_BY_USERNAME);
			statement.setString(1, username);
			LOGGER.trace(String.valueOf(statement));

			result = statement.executeQuery();
			user = userExtractor.extractUser(result, tableSchema);
			// LOGGER.info("User: " + user.getFirstName());
		} catch (SQLException e) {
			LOGGER.error("Error while getting user by username.", e);
		} finally {
			List<Exception> exceptions = closeAll(connection, statement, result);
			// if we have exceptions log them
			if (exceptions.size() > 0) {
				LOGGER.error("Exceptions while closing sql get user by username.");
				for (Exception e : exceptions) {
					LOGGER.error("Error:", e);
				}
			}
		}
		return user;
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserAccountProvider#
	 * getAuthorizedUser(com.biotech.inudstries.web.services.account.IUser)
	 */
	@Override
	public IAuthorizedUser getAuthorizedUser(IUser user, String password) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		IAuthorizedUser authorizedUser = null;

		try {
			connection = DriverManager.getConnection(
					database.getConnectionString(),
					loginInformation.getUsername(),
					loginInformation.getPassword());
			statement = connection.prepareStatement(SELECT_USER_BY_USERNAME_AND_PASSWORD);
			statement.setString(1, user.getUsername());
			statement.setString(2, password);
			LOGGER.trace(String.valueOf(statement));
			result = statement.executeQuery();
			authorizedUser = userExtractor.extractAuthorizedUser(result, tableSchema);
			// LOGGER.info("User: " + user.getFirstName());
		} catch (SQLException e) {
			LOGGER.error("Error while getting authorized user by username.", e);
		} finally {
			List<Exception> exceptions = closeAll(connection, statement, result);
			// if we have exceptions log them
			if (exceptions.size() > 0) {
				LOGGER.error("Exceptions while closing sql authorized get user by username.");
				for (Exception e : exceptions) {
					LOGGER.error("Error:", e);
				}
			}
		}
		return authorizedUser;
	}
}
