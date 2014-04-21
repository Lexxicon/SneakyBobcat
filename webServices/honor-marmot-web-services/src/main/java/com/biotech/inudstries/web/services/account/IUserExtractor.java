/**
 * 
 */
package com.biotech.inudstries.web.services.account;

import java.sql.ResultSet;

import com.biotech.inudstries.web.services.database.IUserTableSchema;

/**
 * Created: Apr 17, 2014
 * 
 * @author Brian Holman
 *
 */
public interface IUserExtractor {
	/**
	 * Attempts to extract and populate a user from the results of the query.
	 * 
	 * @param queryResult
	 *            result of a query
	 * @param tableSchema
	 *            user table schema
	 * @return populated user or null
	 */
	public IUser extractUser(ResultSet queryResult, IUserTableSchema tableSchema);

	/**
	 * 
	 * Attempts to extract and populate a user from the results of the query.
	 * 
	 * @param queryResult
	 *            result of a query
	 * @param tableSchema
	 *            user table schema
	 * @return populated user or null
	 */
	public IAuthorizedUser extractAuthorizedUser(ResultSet queryResult, IUserTableSchema tableSchema);
}
