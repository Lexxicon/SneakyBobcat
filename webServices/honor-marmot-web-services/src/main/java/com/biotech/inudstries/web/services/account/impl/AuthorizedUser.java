/**
 * 
 */
package com.biotech.inudstries.web.services.account.impl;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biotech.inudstries.web.services.account.IAuthorizedUser;
import com.biotech.inudstries.web.services.account.ISetableAuthorizedUser;

/**
 * Created: Apr 21, 2014
 * 
 * @author Brian Holman
 *
 */
public class AuthorizedUser implements IAuthorizedUser, ISetableAuthorizedUser {

	@SuppressWarnings("unused")
	private static transient final Logger LOGGER = LoggerFactory.getLogger(AuthorizedUser.class);

	private int userID;
	private String username;
	private String salt;
	private String firstName;
	private String lastName;
	private String email;

	private String sessionKey;
	private DateTime registrationTime;

	/**
	 * @return the userID
	 */
	@Override
	public int getUserID() {
		return userID;
	}

	/**
	 * @param userID
	 *            the userID to set
	 */
	@Override
	public void setUserID(int userID) {
		this.userID = userID;
	}

	/**
	 * @return the username
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the salt
	 */
	@Override
	public String getSalt() {
		return salt;
	}

	/**
	 * @param salt
	 *            the salt to set
	 */
	@Override
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/**
	 * @return the firstName
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the sessionKey
	 */
	@Override
	public String getSessionKey() {
		return sessionKey;
	}

	/**
	 * @param sessionKey
	 *            the sessionKey to set
	 */
	@Override
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	/**
	 * @return the registrationTime
	 */
	@Override
	public DateTime getRegistrationTime() {
		return registrationTime;
	}

	/**
	 * @param registrationTime
	 *            the registrationTime to set
	 */
	@Override
	public void setRegistrationTime(DateTime registrationTime) {
		this.registrationTime = registrationTime;
	}

}
