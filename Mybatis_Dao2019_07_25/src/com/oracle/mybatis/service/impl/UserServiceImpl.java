package com.oracle.mybatis.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.oracle.mybatis.dao.UserDao;
import com.oracle.mybatis.dao.impl.UserDaoImpl;
import com.oracle.mybatis.model.User;
import com.oracle.mybatis.service.UserService;
import com.oracle.utils.MybatisUtil;

public class UserServiceImpl  implements UserService{

	UserDao userDao=new UserDaoImpl();
	@Override
	public User findUserById(int id) {
		SqlSessionFactory sqlSessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sqlSessionFactory.openSession();
		UserDao daili=session.getMapper(UserDao.class);
		
		User user=daili.findUserById(id);//mybatisһ���������Զ�����
		session.close();//������������һ��Ҫ�ر�sqlsession
		return user;
	}
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userDao.insertUser(user);
	}
	@Override
	public List<User> findUserByQuery(User user) {
		SqlSessionFactory sqlSessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session =sqlSessionFactory.openSession();
		UserDao userDao=session.getMapper(UserDao.class);
		return userDao.findUserByQuery(user);
	}
	@Override
	public void deleteUserIds(int[] ids) {
		// TODO Auto-generated method stub
		SqlSessionFactory sqlSessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session =sqlSessionFactory.openSession();
		UserDao userDao=session.getMapper(UserDao.class);
		userDao.deleteUserIds(ids);
		session.commit();
	}

}
