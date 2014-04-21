/**
 * 
 */
package com.biotech.inudstries.web.services.account;

/**
 * Created: Apr 17, 2014
 * 
 * Service that enables clients to connect to this via web sockets.
 * 
 * @author Brian Holman
 *
 */
public interface IAccountAuthorizationService {
	/**
	 * Starts the account authorization service. Returns true if the service
	 * started successfully.
	 * 
	 * @return true if the service started successfully.
	 */
	public boolean start();

	/**
	 * Stops the account authorization service. Returns true if the service
	 * stopped successfully.
	 * 
	 * @return true if the service stopped successfully.
	 */
	public boolean stop();

	/**
	 * Attempts to authorize the given user.
	 * 
	 * @param user
	 *            user to authorize.
	 * @return true if the user is valid.
	 */
	public IAuthorizedUser authorizeUser(IUser user);

	/**
	 * Ends the given users session.
	 * 
	 * @param user
	 *            user to end the session of.
	 * @return if the users session was ended.
	 */
	public boolean deauthorizeUser(IAuthorizedUser user);

	/**
	 * Determines if the given session ID is still active.
	 * 
	 * @param sessionID
	 *            session to check.
	 * @return if the session is still active.
	 */
	public boolean isSessionActive(String sessionID);
}
