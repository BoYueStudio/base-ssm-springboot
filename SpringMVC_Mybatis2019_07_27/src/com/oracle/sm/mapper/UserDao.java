package com.oracle.sm.mapper;

import com.oracle.sm.model.User;

public interface UserDao {

	public void insertUser(User user);

	public User findUserById(int id);

	public User findUserByUsername(String name);

}