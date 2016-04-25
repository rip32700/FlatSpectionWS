package de.flatspection.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

import de.flatspection.dao.UserDAO;
import de.flatspection.domain.User;

public class UserDAOImpl implements UserDAO {

	private final String FIND_USER_BY_ID = "SELECT * FROM USER WHERE USER_ID = :user_id";
	
	@Inject
	private NamedParameterJdbcOperations jdbcOperations;
	
	@Override
	public User findUserById(Long id) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("user_id", id);
		User user = (User) jdbcOperations.queryForObject(FIND_USER_BY_ID, parameters, this::mapUser);
		return user;
	}
	
	private User mapUser(ResultSet rs, long rowNumber) throws SQLException {
		return new User(rs.getLong("USER_ID"), 
						rs.getString("USERNAME"),
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getString("EMAIL"),
						rs.getString("PASSWORD"),
						rs.getDate("BIRTHDAY").toLocalDate(),
						rs.getString("STREET"),
						rs.getInt("STREET_NR"),
						rs.getString("CITY"),
						rs.getInt("ZIP"),
						rs.getString("TYPE")
				);
	}

}
