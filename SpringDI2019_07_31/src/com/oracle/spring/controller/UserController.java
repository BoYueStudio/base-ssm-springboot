package com.oracle.spring.controller;

import com.oracle.spring.model.User;
import com.oracle.spring.service.UserService;

public class UserController {
	
	//ͨ��spring����ע�����Ҫ�ж����set����!!!
	public UserService userService;
	
	public User findUserById(int id){
		return userService.findUserById(id);
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	

}
