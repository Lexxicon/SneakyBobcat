/**
 * 
 */
package com.biotech.inudstries.web.services.database;

import com.biotech.inudstries.web.services.account.IAuthorizedUser;
import com.biotech.inudstries.web.services.account.IUser;

/**
 * Created: Apr 17, 2014
 * 
 * @author Brian Holman
 *
 */
public interface IUserAccountProvider {

	public static final String WANTED_DATABASE = "USER_ACCOUNT_DATABASE";
	public static final String WANTED_CREDENTIALS = "USER_ACCOUNT_CREDENTIALS";

	public IUser getUserByUsername(String username);

	public IAuthorizedUser getAuthorizedUser(IUser user, String password);
}
