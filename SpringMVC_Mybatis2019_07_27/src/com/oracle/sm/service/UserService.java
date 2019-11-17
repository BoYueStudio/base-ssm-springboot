package com.oracle.sm.service;

import com.oracle.sm.model.User;

public interface UserService {
	public void insertUser(User user);
	public User findUserById(int id);
	public User findUserByUsername(String name);
}
