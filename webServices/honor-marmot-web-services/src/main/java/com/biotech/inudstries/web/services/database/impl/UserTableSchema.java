/**
 * 
 */
package com.biotech.inudstries.web.services.database.impl;

import com.biotech.inudstries.web.services.database.IUserTableSchema;

/**
 * Created: Apr 17, 2014
 * 
 * @author Brian Holman
 *
 */
public class UserTableSchema implements IUserTableSchema {

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IUserTableSchema#getUserIDColumn
	 * ()
	 */
	@Override
	public String getUserIDColumn() {
		return "id_user";
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getUsernameColumn()
	 */
	@Override
	public String getUsernameColumn() {
		return "username";
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IUserTableSchema#getSaltColumn
	 * ()
	 */
	@Override
	public String getSaltColumn() {
		return "salt";
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getPasswordColumn()
	 */
	@Override
	public String getPasswordColumn() {
		return "password";
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getFirstNameColumn()
	 */
	@Override
	public String getFirstNameColumn() {
		return "first_name";
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getLastNameColumn()
	 */
	@Override
	public String getLastNameColumn() {
		return "last_name";
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IUserTableSchema#getEmailColumn
	 * ()
	 */
	@Override
	public String getEmailColumn() {
		return "email";
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getRegistrationTimeColumn()
	 */
	@Override
	public String getRegistrationTimeColumn() {
		return "registration_time";
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IUserTableSchema#getTableName
	 * ()
	 */
	@Override
	public String getTableName() {
		return "user";
	}
}
