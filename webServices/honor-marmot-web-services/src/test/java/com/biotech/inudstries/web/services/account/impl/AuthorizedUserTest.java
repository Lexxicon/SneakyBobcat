/**
 * 
 */
package com.biotech.inudstries.web.services.account.impl;

import junit.framework.TestCase;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Tests the User class to ensure that equals works
 * 
 * Created: Apr 21, 2014
 * 
 * @author Brian Holman
 *
 */
public class AuthorizedUserTest extends TestCase {

	private static transient final Logger LOGGER = LoggerFactory.getLogger(AuthorizedUserTest.class);

	private int userID;

	private String username;
	private String salt;
	private String firstName;
	private String lastName;
	private String email;

	private String sessionKey;
	private DateTime registrationTime;

	private AuthorizedUser authedUser;
	private User emptyUser;

	/*
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	@Before
	protected void setUp() throws Exception {
		LOGGER.info("Setting up " + getClass());

		userID = 0;
		username = "username";
		salt = "salt";
		firstName = "John";
		lastName = "Smith";
		email = "example@example.com";
		sessionKey = "sessionKey";
		registrationTime = new DateTime(5000);

		authedUser = new AuthorizedUser();
		authedUser.setUsername(username);
		authedUser.setSalt(salt);
		authedUser.setFirstName(firstName);
		authedUser.setLastName(lastName);
		authedUser.setEmail(email);
		authedUser.setUserID(userID);
		authedUser.setSessionKey(sessionKey);
		authedUser.setRegistrationTime(registrationTime);

		emptyUser = new AuthorizedUser();

		super.setUp();
	}

	@Test
	public void testEquals() {
		assertEquals(true, authedUser.equals(authedUser));
		assertEquals(true, emptyUser.equals(emptyUser));
		assertEquals(false, authedUser.equals(null));
		assertEquals(false, authedUser.equals(emptyUser));
		assertEquals(false, emptyUser.equals(authedUser));
	}

	/*
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	@After
	protected void tearDown() throws Exception {
		LOGGER.info("Tearing down " + getClass());
		authedUser = null;
		username = null;
		salt = null;
		firstName = null;
		lastName = null;
		email = null;
		sessionKey = null;
		registrationTime = null;

		super.tearDown();
	}
}
