/**
 * 
 */
package com.biotech.inudstries.web.services.account.impl;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Tests the User class to ensure that equals works.
 * 
 * Created: Apr 21, 2014
 * 
 * @author Brian Holman
 *
 */
public class UserTest extends TestCase {

	private static transient final Logger LOGGER = LoggerFactory.getLogger(UserTest.class);

	private String username;
	private String salt;
	private String firstName;
	private String lastName;
	private String email;

	private User user;
	private User emptyUser;

	/*
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	@Before
	protected void setUp() throws Exception {
		LOGGER.info("Setting up " + getClass());
		username = "username";
		salt = "salt";
		firstName = "John";
		lastName = "Smith";
		email = "example@example.com";

		user = new User();
		user.setUsername(username);
		user.setSalt(salt);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);

		emptyUser = new User();

		super.setUp();
	}

	@Test
	public void testEquals() {
		assertEquals(true, user.equals(user));
		assertEquals(true, emptyUser.equals(emptyUser));
		assertEquals(false, user.equals(null));
		assertEquals(false, user.equals(emptyUser));
		assertEquals(false, emptyUser.equals(user));
	}

	/*
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	@After
	protected void tearDown() throws Exception {
		LOGGER.info("Tearing down " + getClass());
		user = null;
		username = null;
		salt = null;
		firstName = null;
		lastName = null;
		email = null;
		super.tearDown();
	}
}
