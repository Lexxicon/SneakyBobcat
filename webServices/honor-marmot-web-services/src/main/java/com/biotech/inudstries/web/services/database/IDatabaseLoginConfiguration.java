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
public interface IDatabaseLoginConfiguration {

	/**
	 * Username for the given database
	 * 
	 * @return
	 */
	public String getUsername();

	/**
	 * Password for the given database
	 * 
	 * @return
	 */
	public String getPassword();
}
