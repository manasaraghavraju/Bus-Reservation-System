package com.lti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.dao.UserRepo;
import com.lti.entity.User;
import com.lti.exceptions.NoUserFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo uRepo;
	
	@Transactional
	@Override
	public User createUser(User u) {
		return uRepo.save(u);
	}

	@Override
	public List<User> listOfUsers() {
		return uRepo.findAll();
	}

	@Override
	public User findUserById(int uid) throws NoUserFoundException {
		Optional<User> uFind=uRepo.findById(uid);
		User u1=null;
		if(uFind.isPresent()) {
			u1=uFind.get();
		}
		else {
			throw new NoUserFoundException("User Not Found");
		}
		return u1;
	}

}
