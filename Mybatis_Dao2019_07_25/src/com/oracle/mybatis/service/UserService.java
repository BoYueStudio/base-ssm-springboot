package com.oracle.mybatis.service;

import java.util.List;

import com.oracle.mybatis.model.User;

public interface UserService {
	public User findUserById(int id);
	public void insertUser(User user);
	public List<User> findUserByQuery(User user);
	public void  deleteUserIds(int[] ids);
}
