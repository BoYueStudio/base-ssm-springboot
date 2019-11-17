package com.oracle.spring.service.impl;

import com.oracle.spring.model.User;
import com.oracle.spring.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User findUserById(int id) {
		
		User user=new User(id,"boyue");
		
		return user;
	}

	

}
