package com.oracle.aop.service.impl;

import com.oracle.aop.model.User;
import com.oracle.aop.service.UserService;

public class UserServiceImpl implements UserService {

	

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		//必需要进行事务管理
				System.out.println("删除id的user用户1");
				System.out.println("插入id为user用户2");
		
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("增加id的user用户1");
		System.out.println("增加id为user用户2");
	}

	@Override
	public void updateUserById(int id) {
		// TODO Auto-generated method stub
		System.out.println("修改id的user用户1"+id);
		System.out.println("修改id为user用户2");
		
	}

	

}
