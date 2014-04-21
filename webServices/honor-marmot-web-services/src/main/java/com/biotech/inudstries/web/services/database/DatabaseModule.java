/**
 * 
 */
package com.biotech.inudstries.web.services.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biotech.inudstries.web.services.account.AccountAuthorizationModule;
import com.biotech.inudstries.web.services.database.impl.UserAccountDatabase;
import com.biotech.inudstries.web.services.database.impl.UserAccountDatabaseLoginCredentials;
import com.biotech.inudstries.web.services.database.impl.UserAccountProvider;
import com.biotech.inudstries.web.services.database.impl.UserTableSchema;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created: Apr 17, 2014
 * 
 * @author Brian Holman
 *
 */
public class DatabaseModule extends AbstractModule {

	private static transient final Logger LOGGER = LoggerFactory.getLogger(DatabaseModule.class);
	public static final String MODULE_NAME = "Database Module";

	/*
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		LOGGER.info("Establishing: " + MODULE_NAME);

		install(new AccountAuthorizationModule());

		bind(IUserAccountProvider.class).to(UserAccountProvider.class);
		bind(IUserTableSchema.class).to(UserTableSchema.class);
		bind(IDatabaseConfiguration.class).annotatedWith(Names.named(IUserAccountProvider.WANTED_DATABASE)).to(
				UserAccountDatabase.class);
		bind(IDatabaseLoginConfiguration.class).annotatedWith(Names.named(IUserAccountProvider.WANTED_CREDENTIALS)).to(
				UserAccountDatabaseLoginCredentials.class);
		LOGGER.info("Established: " + MODULE_NAME);
	}
}
