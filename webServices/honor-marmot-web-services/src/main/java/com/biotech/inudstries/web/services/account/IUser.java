/**
 * 
 */
package com.biotech.inudstries.web.services.account;

/**
 * Created: Apr 17, 2014
 * 
 * @author Brian Holman
 *
 */
public interface IUser {

	public String getUsername();

	public String getSalt();

	public String getFirstName();

	public String getLastName();

	public String getEmail();
}
