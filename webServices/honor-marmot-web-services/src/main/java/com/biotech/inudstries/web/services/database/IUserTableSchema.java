/**
 * 
 */
package com.biotech.inudstries.web.services.database;

/**
 * Created: Apr 17, 2014
 * 
 * @author Brian Holman
 *
 */
public interface IUserTableSchema {
	public String getTableName();

	public String getUserIDColumn();

	public String getUsernameColumn();

	public String getSaltColumn();

	public String getPasswordColumn();

	public String getFirstNameColumn();

	public String getLastNameColumn();

	public String getEmailColumn();

	public String getRegistrationTimeColumn();

}
