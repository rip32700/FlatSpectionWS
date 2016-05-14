package de.flatspection.dao;

import de.flatspection.domain.User;


public interface UserDAO extends DataAccessObject<User> {

	User findByEmail(final String email);
	boolean deleteByEmail(final String email);
	
}
