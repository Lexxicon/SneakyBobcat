/**
 * 
 */
package com.biotech.inudstries.web.services.account;

/**
 * Created: Apr 21, 2014
 * 
 * @author Brian Holman
 *
 */
public interface ISetableUser extends IUser {

	public void setUsername(String username);

	public void setSalt(String sale);

	public void setFirstName(String firstName);

	public void setLastName(String lastName);

	public void setEmail(String email);
}
