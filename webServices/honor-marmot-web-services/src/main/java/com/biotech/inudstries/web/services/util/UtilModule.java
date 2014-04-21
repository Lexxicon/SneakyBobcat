/**
 * 
 */
package com.biotech.inudstries.web.services.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

/**
 * Created: Apr 21, 2014
 * 
 * @author Brian Holman
 *
 */
public class UtilModule extends AbstractModule {

	private static transient final Logger LOGGER = LoggerFactory.getLogger(UtilModule.class);
	public static final String MODULE_NAME = "Account Authorization Module";

	/*
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		LOGGER.info("Establishing: " + MODULE_NAME);
		install(new FactoryModuleBuilder().build(IDateTimeFactory.class));
		LOGGER.info("Established: " + MODULE_NAME);
	}
}
