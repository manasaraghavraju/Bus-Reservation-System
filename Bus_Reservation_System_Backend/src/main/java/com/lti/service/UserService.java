package com.lti.service;

import java.util.List;

import com.lti.entity.User;
import com.lti.exceptions.NoUserFoundException;

public interface UserService {

	public User createUser(User u);
	public List<User> listOfUsers();
	public User findUserById(int uid) throws NoUserFoundException;

	
}
