/**
 * 
 */
package com.biotech.inudstries.web.services.account.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biotech.inudstries.web.services.account.ISetableUser;
import com.biotech.inudstries.web.services.account.IUser;

/**
 * Created: Apr 17, 2014
 * 
 * @author Brian Holman
 *
 */
public class User implements IUser, ISetableUser {

	@SuppressWarnings("unused")
	private static transient final Logger LOGGER = LoggerFactory.getLogger(User.class);

	private String username;
	private String salt;
	private String firstName;
	private String lastName;
	private String email;

	public User() {

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

}
