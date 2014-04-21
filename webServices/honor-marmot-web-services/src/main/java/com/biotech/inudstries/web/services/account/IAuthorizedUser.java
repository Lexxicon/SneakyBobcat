/**
 * 
 */
package com.biotech.inudstries.web.services.account;

import org.joda.time.DateTime;

/**
 * Created: Apr 17, 2014
 * 
 * @author Brian Holman
 *
 */
public interface IAuthorizedUser extends IUser {

	public int getUserID();

	public String getSessionKey();

	public DateTime getRegistrationTime();

}
