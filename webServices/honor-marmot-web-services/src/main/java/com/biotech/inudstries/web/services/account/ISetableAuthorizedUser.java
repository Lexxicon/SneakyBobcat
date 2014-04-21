/**
 * 
 */
package com.biotech.inudstries.web.services.account;

import org.joda.time.DateTime;

/**
 * Created: Apr 21, 2014
 * 
 * @author Brian Holman
 *
 */
public interface ISetableAuthorizedUser extends IAuthorizedUser, ISetableUser {

	public void setUserID(int id);

	public void setSessionKey(String sessionKey);

	public void setRegistrationTime(DateTime registrationTime);
}
