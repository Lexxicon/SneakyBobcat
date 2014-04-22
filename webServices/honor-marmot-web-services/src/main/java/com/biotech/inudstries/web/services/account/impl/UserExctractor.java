/**
 * 
 */
package com.biotech.inudstries.web.services.account.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biotech.inudstries.web.services.account.IAuthorizedUser;
import com.biotech.inudstries.web.services.account.ISetableAuthorizedUser;
import com.biotech.inudstries.web.services.account.ISetableUser;
import com.biotech.inudstries.web.services.account.IUser;
import com.biotech.inudstries.web.services.account.IUserExtractor;
import com.biotech.inudstries.web.services.database.IUserTableSchema;
import com.biotech.inudstries.web.services.util.IDateTimeFactory;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Created: Apr 18, 2014
 * 
 * @author Brian Holman
 *
 */
public class UserExctractor implements IUserExtractor {

	private static transient final Logger LOGGER = LoggerFactory.getLogger(UserExctractor.class);

	@Inject
	private Provider<ISetableUser> userProvider;

	@Inject
	private Provider<ISetableAuthorizedUser> authorizedUserProvider;

	@Inject
	private IDateTimeFactory dateTimeConverter;

	/*
	 * @see
	 * com.biotech.inudstries.web.services.account.IUserFactory#extractUser(
	 * java.sql.ResultSet,
	 * com.biotech.inudstries.web.services.database.IUserTableSchema)
	 */
	@Override
	public IUser extractUser(final ResultSet queryResult, final IUserTableSchema tableSchema) {
		try {
			while (queryResult.next()) {
				ISetableUser user = userProvider.get();
				user.setUsername(queryResult.getString(tableSchema.getUsernameColumn()));

				user.setFirstName(queryResult.getString(tableSchema.getFirstNameColumn()));
				user.setLastName(queryResult.getString(tableSchema.getLastNameColumn()));

				user.setEmail(queryResult.getString(tableSchema.getEmailColumn()));

				user.setSalt(queryResult.getString(tableSchema.getSaltColumn()));

				return user;
			}
		} catch (SQLException e) {
			LOGGER.error("Failed to extract user!", e);
		}
		return null;
	}

	/*
	 * @see com.biotech.inudstries.web.services.account.IUserExtractor#
	 * extractAuthorizedUser(java.sql.ResultSet,
	 * com.biotech.inudstries.web.services.database.IUserTableSchema)
	 */
	@Override
	public IAuthorizedUser extractAuthorizedUser(ResultSet queryResult, IUserTableSchema tableSchema) {
		try {
			while (queryResult.next()) {
				ISetableAuthorizedUser user = authorizedUserProvider.get();
				user.setUsername(queryResult.getString(tableSchema.getUsernameColumn()));

				user.setFirstName(queryResult.getString(tableSchema.getFirstNameColumn()));
				user.setLastName(queryResult.getString(tableSchema.getLastNameColumn()));

				user.setEmail(queryResult.getString(tableSchema.getEmailColumn()));

				user.setSalt(queryResult.getString(tableSchema.getSaltColumn()));

				user.setUserID(queryResult.getInt(tableSchema.getUserIDColumn()));
				user.setRegistrationTime(dateTimeConverter.create(queryResult.getTimestamp(tableSchema
						.getRegistrationTimeColumn())));
				return user;
			}
		} catch (SQLException e) {
			LOGGER.error("Failed to extract user!", e);
		}
		return null;
	}
}
