package com.oracle.mybatis.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.oracle.mybatis.dao.OrdersDao;
import com.oracle.mybatis.dao.UserDao;
import com.oracle.mybatis.dao.impl.OrdersDaoImpl;
import com.oracle.mybatis.model.Goods;
import com.oracle.mybatis.model.Orders;
import com.oracle.mybatis.service.OrdersService;
import com.oracle.utils.MybatisUtil;

public class OrdersServiceImpl implements OrdersService {
	
	
	@Override
	public Orders findOrdersById(int id) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		OrdersDao daili=session.getMapper(OrdersDao.class);
		return daili.findOrdersById(id);
	}

	@Override
	public List<Orders> findAllOrdersAndUser() {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		OrdersDao daili=session.getMapper(OrdersDao.class);
		return daili.findAllOrdersAndUser();
	}

	@Override
	public List<Goods> findAllOrderGoodsUserByUsername() {
		SqlSessionFactory sqlSessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sqlSessionFactory.openSession();
		OrdersDao ordersDao=session.getMapper(OrdersDao.class);
		return ordersDao.findAllOrderGoodsUserByUsername();
	}

}
