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

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IDatabaseLoginConfiguration
	 * #getUsername()
	 */
	@Override
	public String getUsername() {
		return "account_service";
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IDatabaseLoginConfiguration
	 * #getPassword()
	 */
	@Override
	public String getPassword() {
		return "OLa6co2GzW8ivYAKc89I";
	}

}
