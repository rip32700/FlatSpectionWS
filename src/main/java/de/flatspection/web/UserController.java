package de.flatspection.web;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.flatspection.dao.UserDAO;
import de.flatspection.domain.User;

@RestController
@RequestMapping("user")
public class UserController {

	@Inject
	private UserDAO repository;
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable("userId") Long userId) {
		User user = repository.findUserById(userId);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
}
