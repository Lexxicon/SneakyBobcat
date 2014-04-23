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

	final String tableName = Messages.getString("UserTableSchema.TABLE_NAME");

	final String userIDColumn = Messages.getString("UserTableSchema.USER_ID");
	final String usernameColumn = Messages.getString("UserTableSchema.USERNAME");
	final String saltColumn = Messages.getString("UserTableSchema.SALT");
	final String passwordColumn = Messages.getString("UserTableSchema.PASSWORD");
	final String firstNameColumn = Messages.getString("UserTableSchema.FIRSTNAME");
	final String lastNameColumn = Messages.getString("UserTableSchema.LASTNAME");
	final String emailColumn = Messages.getString("UserTableSchema.EMAIL");
	final String registrationTimeColumn = Messages.getString("UserTableSchema.REGISTRATION_TIME");

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IUserTableSchema#getUserIDColumn
	 * ()
	 */
	@Override
	public String getUserIDColumn() {
		return userIDColumn;
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getUsernameColumn()
	 */
	@Override
	public String getUsernameColumn() {
		return usernameColumn;
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IUserTableSchema#getSaltColumn
	 * ()
	 */
	@Override
	public String getSaltColumn() {
		return saltColumn;
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getPasswordColumn()
	 */
	@Override
	public String getPasswordColumn() {
		return passwordColumn;
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getFirstNameColumn()
	 */
	@Override
	public String getFirstNameColumn() {
		return firstNameColumn;
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getLastNameColumn()
	 */
	@Override
	public String getLastNameColumn() {
		return lastNameColumn;
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IUserTableSchema#getEmailColumn
	 * ()
	 */
	@Override
	public String getEmailColumn() {
		return emailColumn;
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getRegistrationTimeColumn()
	 */
	@Override
	public String getRegistrationTimeColumn() {
		return registrationTimeColumn;
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IUserTableSchema#getTableName
	 * ()
	 */
	@Override
	public String getTableName() {
		return tableName;
	}
}
