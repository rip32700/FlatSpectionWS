package de.flatspection.web;

import java.util.List;

import javax.inject.Inject;

import org.osgi.service.component.annotations.Deactivate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.flatspection.dao.UserDAO;
import de.flatspection.domain.user.User;

@RestController
@RequestMapping("user")
public class UserController {

	@Inject
	private UserDAO repository;
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable("userId") String userId) {
		User user = repository.findById(userId);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<?> getAllUser() {
		List<User> users = repository.findAll();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User user) {
	        repository.save(user);
	        return new ResponseEntity<>(user, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="", method=RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@RequestBody User user) {
	        repository.update(user);
	        return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{userId}", method=RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable("userId") String userId) {
	        repository.delete(userId);
	        return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
}
