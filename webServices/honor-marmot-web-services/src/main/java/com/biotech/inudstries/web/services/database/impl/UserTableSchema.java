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
		return Messages.getString("UserTableSchema.USER_ID"); //$NON-NLS-1$
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getUsernameColumn()
	 */
	@Override
	public String getUsernameColumn() {
		return Messages.getString("UserTableSchema.USERNAME"); //$NON-NLS-1$
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IUserTableSchema#getSaltColumn
	 * ()
	 */
	@Override
	public String getSaltColumn() {
		return Messages.getString("UserTableSchema.SALT"); //$NON-NLS-1$
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getPasswordColumn()
	 */
	@Override
	public String getPasswordColumn() {
		return Messages.getString("UserTableSchema.PASSWORD"); //$NON-NLS-1$
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getFirstNameColumn()
	 */
	@Override
	public String getFirstNameColumn() {
		return Messages.getString("UserTableSchema.FIRSTNAME"); //$NON-NLS-1$
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getLastNameColumn()
	 */
	@Override
	public String getLastNameColumn() {
		return Messages.getString("UserTableSchema.LASTNAME"); //$NON-NLS-1$
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IUserTableSchema#getEmailColumn
	 * ()
	 */
	@Override
	public String getEmailColumn() {
		return Messages.getString("UserTableSchema.EMAIL"); //$NON-NLS-1$
	}

	/*
	 * @see com.biotech.inudstries.web.services.database.IUserTableSchema#
	 * getRegistrationTimeColumn()
	 */
	@Override
	public String getRegistrationTimeColumn() {
		return Messages.getString("UserTableSchema.REGISTRATION_TIME"); //$NON-NLS-1$
	}

	/*
	 * @see
	 * com.biotech.inudstries.web.services.database.IUserTableSchema#getTableName
	 * ()
	 */
	@Override
	public String getTableName() {
		return Messages.getString("UserTableSchema.TABLE_NAME"); //$NON-NLS-1$
	}
}
