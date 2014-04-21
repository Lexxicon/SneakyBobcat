package com.biotech.inudstries.web.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biotech.inudstries.web.services.database.DatabaseModule;
import com.biotech.inudstries.web.services.database.IUserAccountProvider;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

	private static final transient Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOGGER.info("Establishing Injector");
		Injector injector = Guice.createInjector(new DatabaseModule());
		LOGGER.info("Launching application");
		injector.getInstance(IUserAccountProvider.class).getUserByUsername("test");
		LOGGER.info("Exiting application");
	}

}
