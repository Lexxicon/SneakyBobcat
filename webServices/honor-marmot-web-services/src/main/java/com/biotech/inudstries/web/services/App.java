package com.biotech.inudstries.web.services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.biotech.inudstries.web.services.account.IAuthorizedUser;
import com.biotech.inudstries.web.services.account.IUser;
import com.biotech.inudstries.web.services.database.IUserAccountProvider;
import com.biotech.inudstries.web.services.database.impl.DatabaseModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

	private static final transient Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOGGER.info("Establishing Injector");
		Injector injector = Guice.createInjector(new DatabaseModule());
		LOGGER.info("Launching application");
		IUserAccountProvider provider = injector.getInstance(IUserAccountProvider.class);
		IUser user = provider.getUserByUsername("test");
		LOGGER.info("User " + user.getFirstName());
		try {
			String password = "password";
			String saltedPassword = password + user.getSalt();
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(saltedPassword.getBytes());
			byte[] hashed = md.digest();

			StringBuffer hexString = new StringBuffer();
			for (int i = 0; i < hashed.length; i++) {
				String hex = Integer.toHexString(0xff & hashed[i]);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}
			IAuthorizedUser authUser = provider.getAuthorizedUser(user, hexString.toString());
			LOGGER.info(String.valueOf(authUser.getUserID()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		LOGGER.info("Exiting application");
	}
}
