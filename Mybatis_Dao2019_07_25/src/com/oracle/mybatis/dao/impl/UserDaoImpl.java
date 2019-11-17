package com.oracle.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.oracle.mybatis.dao.UserDao;
import com.oracle.mybatis.model.User;
import com.oracle.utils.MybatisUtil;

public class UserDaoImpl  implements UserDao {

	@Override
	public User findUserById(int id) {
		SqlSession session=new MybatisUtil().getSessionFactory().openSession();
	    return 	session.selectOne("user.findUserById",id);
		
		
	}

	@Override
	public void insertUser(User user) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		
		session.insert("user.insertUser",user);
		session.commit();
	}

	@Override
	public List<User> findUserByQuery(User user) {
		
		
		return null;
	}

	@Override
	public void deleteUserIds(int[] ids) {
		// TODO Auto-generated method stub
		
	}
	
}
