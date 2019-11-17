package com.oracle.spring.ioc;

public class UserServiceImpl implements UserService {

	@Override
	public User findUserById(int id) {
		
		User user=new User(id,"boyue");
		
		return user;
	}

	

}
