package de.flatspection.dao;

import java.util.List;

import de.flatspection.domain.User;

public interface UserDAO {

	User findUserById(final Long id);
	List<User> findAllUser();
	User save(User user);
}
