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
public interface IDatabaseConfiguration {
	/**
	 * Formatted string where 1 = server address, 2 = server port, and 3 =
	 * database name
	 */
	public static final String CONNECTION_FORMAT = "jdbc:mysql://%1$s:%2$s/%3$s";

	public String getConnectionString();

	public boolean loadDatabaseDriver();

	public String getDatabaseName();

	public int getServerPort();

	public String getServerAddress();

}
