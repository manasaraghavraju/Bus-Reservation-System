package com.lti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.User;
import com.lti.exceptions.NoUserFoundException;
import com.lti.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService uService;
	

	@GetMapping("/users")
	public List<User> getAllUsers(){
		return uService.listOfUsers();
	}
	
	@GetMapping("/users/{uid}")
	public User getById(@PathVariable("uid")int uid) throws NoUserFoundException{
		return uService.findUserById(uid);
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User u) {
		return uService.createUser(u);
	}
	
	
}

