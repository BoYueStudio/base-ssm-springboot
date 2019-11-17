package com.oracle.aop.service;

import com.oracle.aop.model.User;

public interface UserService {
	void deleteUserById(int id);
	void addUser(User user);
	void updateUserById(int id);
}
