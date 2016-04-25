package de.flatspection.dao;

import de.flatspection.domain.User;

public interface UserDAO {

	User findUserById(final Long id);
	
}
