package com.oracle.sm.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.oracle.sm.mapper.UserDao;
import com.oracle.sm.model.User;
import com.oracle.sm.service.UserService;
import com.oracle.sm.utils.MybatisUtil;

public class UserServiceImpl implements UserService {


	@Override
	public void insertUser(User user) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		UserDao userDao=session.getMapper(UserDao.class);
		userDao.insertUser(user);
		session.commit();
		session.close();
		
	}
	
	public User findUserById(int id){
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		UserDao userDao=session.getMapper(UserDao.class);
		User user= userDao.findUserById(id);
		session.commit();
		session.close();
		return user;
		
	}

	@Override
	public User findUserByUsername(String name) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		UserDao userDao=session.getMapper(UserDao.class);
		User user=userDao.findUserByUsername(name);
		session.commit();
		session.close();
		return user;
	}
	

}
