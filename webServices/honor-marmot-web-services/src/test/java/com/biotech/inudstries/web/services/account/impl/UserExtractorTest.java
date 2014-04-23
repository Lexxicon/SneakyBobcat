/**
 * 
 */
package com.biotech.inudstries.web.services.account.impl;

import junit.framework.TestCase;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created: Apr 21, 2014
 * 
 * @author Brian Holman
 *
 */
public class UserExtractorTest extends TestCase {

	private static transient final Logger LOGGER = LoggerFactory.getLogger(UserExtractorTest.class);

	/*
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		LOGGER.info("Setting up " + getClass());
		super.setUp();
	}

	@Test
	public void testExtraction() {

	}

	/*
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		LOGGER.info("Tearing down " + getClass());
		super.tearDown();
	}
}
