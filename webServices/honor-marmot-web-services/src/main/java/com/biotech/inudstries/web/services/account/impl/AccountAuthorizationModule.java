package com.biotech.inudstries.web.services.account.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biotech.inudstries.web.services.account.IAuthorizedUser;
import com.biotech.inudstries.web.services.account.ISetableAuthorizedUser;
import com.biotech.inudstries.web.services.account.ISetableUser;
import com.biotech.inudstries.web.services.account.IUser;
import com.biotech.inudstries.web.services.account.IUserExtractor;
import com.biotech.inudstries.web.services.util.UtilModule;
import com.google.inject.AbstractModule;

public class AccountAuthorizationModule extends AbstractModule {

	private static transient final Logger LOGGER = LoggerFactory.getLogger(AccountAuthorizationModule.class);
	public static final String MODULE_NAME = "Account Authorization Module";

	@Override
	protected void configure() {
		LOGGER.info("Establishing: " + MODULE_NAME);
		install(new UtilModule());

		bind(IUserExtractor.class).to(UserExctractor.class);
		bind(IUser.class).to(User.class);
		bind(ISetableUser.class).to(User.class);
		bind(IAuthorizedUser.class).to(AuthorizedUser.class);
		bind(ISetableAuthorizedUser.class).to(AuthorizedUser.class);
		LOGGER.info("Established: " + MODULE_NAME);
	}
}
