package com.oracle.aop.service.impl;

import com.oracle.aop.model.User;
import com.oracle.aop.service.UserService;

public class UserServiceImpl implements UserService {

	

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		//����Ҫ�����������
				System.out.println("ɾ��id��user�û�1");
				System.out.println("����idΪuser�û�2");
		
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("����id��user�û�1");
		System.out.println("����idΪuser�û�2");
	}

	@Override
	public void updateUserById(int id) {
		// TODO Auto-generated method stub
		System.out.println("�޸�id��user�û�1"+id);
		System.out.println("�޸�idΪuser�û�2");
		
	}

	

}
