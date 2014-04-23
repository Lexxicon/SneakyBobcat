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
public class AuthorizedUser extends User implements IAuthorizedUser, ISetableAuthorizedUser {

	@SuppressWarnings("unused")
	private static transient final Logger LOGGER = LoggerFactory.getLogger(AuthorizedUser.class);

	private int userID;

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

	/*
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((registrationTime == null) ? 0 : registrationTime.hashCode());
		result = prime * result + ((sessionKey == null) ? 0 : sessionKey.hashCode());
		result = prime * result + userID;
		return result;
	}

	/*
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AuthorizedUser other = (AuthorizedUser) obj;
		if (registrationTime == null) {
			if (other.registrationTime != null) {
				return false;
			}
		} else if (!registrationTime.equals(other.registrationTime)) {
			return false;
		}
		if (sessionKey == null) {
			if (other.sessionKey != null) {
				return false;
			}
		} else if (!sessionKey.equals(other.sessionKey)) {
			return false;
		}
		if (userID != other.userID) {
			return false;
		}
		return true;
	}
}
