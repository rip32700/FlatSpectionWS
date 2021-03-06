package de.flatspection.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

import de.flatspection.dao.UserDAO;
import de.flatspection.domain.User;

public class UserDAOImpl implements UserDAO {

	private final String FIND_USER_BY_ID = "SELECT * FROM USER WHERE USER_ID = :user_id";
	private final String FIND_ALL_USERS  = "SELECT * FROM USER";
	private final String INSERT_USER     = "INSERT INTO USER (USERNAME, FIRSTNAME, LASTNAME, EMAIL, PASSWORD, BIRTHDAY, STREET, STREET_NR, CITY, ZIP, TYPE, ROLE) VALUES (:username, :firstname, :lastname, :email, :password, :birthday, :street, :street_nr, :city, :zip, :type, :role)";
	
	@Inject
	private NamedParameterJdbcOperations jdbcOperations;
	
	@Override
	public User findById(String id) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("user_id", id);
		User user = jdbcOperations.queryForObject(FIND_USER_BY_ID, parameters, this::mapUser);
		return user;
	}
	
	@Override
	public List<User> findAll() {
		List<User> userList = jdbcOperations.query(FIND_ALL_USERS, this::mapUser);
		return userList;
	}
	
	@Override
	public boolean save(User user) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		/*
		parameters.put("username", user.getUsername());
		parameters.put("firstname", user.getFirstname());
		parameters.put("lastname", user.getLastname());
		parameters.put("email", user.getEmail());
		parameters.put("password", user.getPassword());
		parameters.put("birthday", user.getBirthday());
		parameters.put("street", user.getStreet());
		parameters.put("street_nr", user.getStreetNumber());
		parameters.put("city", user.getCity());
		parameters.put("zip", user.getZip());
		parameters.put("type", user.getType());
		parameters.put("role", user.getRole());
		*/
		jdbcOperations.update(INSERT_USER, parameters);
		return true;
	}
	
	private User mapUser(ResultSet rs, long rowNumber) throws SQLException {
		return new User(); /*rs.getLong("USER_ID"), 
						rs.getString("USERNAME"),
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getString("EMAIL"),
						rs.getString("PASSWORD"),
						rs.getString("BIRTHDAY"),//getDate("BIRTHDAY").toLocalDate(),
						rs.getString("STREET"),
						rs.getInt("STREET_NR"),
						rs.getString("CITY"),
						rs.getInt("ZIP"),
						rs.getString("TYPE"),
						rs.getInt("ROLE")
				); */
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteByEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User object) {
		// TODO Auto-generated method stub
		return false;
	}


}
