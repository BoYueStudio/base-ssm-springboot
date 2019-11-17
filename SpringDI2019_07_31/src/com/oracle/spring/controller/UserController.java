package com.oracle.spring.controller;

import com.oracle.spring.model.User;
import com.oracle.spring.service.UserService;

public class UserController {
	
	//通过spring依赖注入必需要有对象的set方法!!!
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
