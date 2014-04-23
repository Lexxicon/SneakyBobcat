/**
 * 
 */
package com.biotech.inudstries.web.services.database.impl;

import com.biotech.inudstries.web.services.database.IDatabaseLoginConfiguration;

/**
 * Created: Apr 17, 2014
 * 
 * @author Brian Holman
 *
 */
public class UserAccountDatabaseLoginCredentials implements IDatabaseLoginConfiguration {

	String username = Messages.getString("UserAccountDatabaseLoginCredentials.USERNAME");
	String password = Messages.getString("UserAccountDatabaseLoginCredentials.PASSWORD");

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IDatabaseLoginConfiguration
	 * #getUsername()
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IDatabaseLoginConfiguration
	 * #getPassword()
	 */
	@Override
	public String getPassword() {
		return password;
	}

}
