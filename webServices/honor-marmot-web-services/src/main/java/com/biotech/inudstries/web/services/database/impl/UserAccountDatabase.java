/**
 * 
 */
package com.biotech.inudstries.web.services.database.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biotech.inudstries.web.services.database.IDatabaseConfiguration;

/**
 * Created: Apr 17, 2014
 * 
 * @author Brian Holman
 *
 */
public class UserAccountDatabase implements IDatabaseConfiguration {
	private static transient final Logger LOGGER = LoggerFactory.getLogger(UserAccountDatabase.class);

	/*
	 * @see com.biotech.inudstries.web.services.database.IDatabaseConfiguration#
	 * getDatabaseName()
	 */
	@Override
	public String getDatabaseName() {
		return "honorMarmot";
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IDatabaseConfiguration#
	 * getServerPort()
	 */
	@Override
	public int getServerPort() {
		return 3306;
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IDatabaseConfiguration#
	 * getServerAddress()
	 */
	@Override
	public String getServerAddress() {
		return "192.168.1.4";
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IDatabaseConfiguration#
	 * loadDatabaseDriver()
	 */
	@Override
	public boolean loadDatabaseDriver() {
		LOGGER.debug("Loading drivers for " + getDatabaseName());
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Failed to load drivers for " + getDatabaseName(), e);
			return false;
		}
		return true;
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IDatabaseConfiguration#
	 * getConnectionString()
	 */
	@Override
	public String getConnectionString() {

		return String.format(
				IDatabaseConfiguration.CONNECTION_FORMAT,
				getServerAddress(),
				getServerPort(),
				getDatabaseName());
	}
}
