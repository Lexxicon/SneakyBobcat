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
		return Messages.getString("UserAccountDatabase.DATABASE_NAME"); //$NON-NLS-1$
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
		return Messages.getString("UserAccountDatabase.SERVER_IP"); //$NON-NLS-1$
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IDatabaseConfiguration#
	 * loadDatabaseDriver()
	 */
	@Override
	public boolean loadDatabaseDriver() {
		LOGGER.debug("Loading drivers for " + getDatabaseName()); //$NON-NLS-1$
		try {
			Class.forName(Messages.getString("UserAccountDatabase.DATABASE_DRIVER")); //$NON-NLS-1$
		} catch (ClassNotFoundException e) {
			LOGGER.error("Failed to load drivers for " + getDatabaseName(), e); //$NON-NLS-1$
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
