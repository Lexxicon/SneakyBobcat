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
		return Messages.getString("UserAccountDatabaseLoginCredentials.USERNAME"); //$NON-NLS-1$
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IDatabaseLoginConfiguration
	 * #getPassword()
	 */
	@Override
	public String getPassword() {
		return Messages.getString("UserAccountDatabaseLoginCredentials.PASSWORD"); //$NON-NLS-1$
	}

}
