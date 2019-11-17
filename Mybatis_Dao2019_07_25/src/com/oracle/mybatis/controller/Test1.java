package com.oracle.mybatis.controller;

import java.util.List;

import org.junit.Test;

import com.oracle.mybatis.dao.OrdersDao;
import com.oracle.mybatis.model.Goods;
import com.oracle.mybatis.model.Orders;
import com.oracle.mybatis.model.User;
import com.oracle.mybatis.service.OrdersService;
import com.oracle.mybatis.service.UserService;
import com.oracle.mybatis.service.impl.OrdersServiceImpl;
import com.oracle.mybatis.service.impl.UserServiceImpl;

public class Test1 {
	
	@Test
	public void test1(){
		UserService userService=new UserServiceImpl();
		System.out.println(userService.findUserById(2));
		
		
		UserService userService2=new UserServiceImpl();
		System.out.println(userService2.findUserById(2));
		
		
	}
	@Test
	public void test2(){
		UserService userService=new UserServiceImpl();
		User user=new User("博悦", "6543", "光明南大街", "8765432", "男");
		userService.insertUser(user);
	}
	@Test
	public void test3(){
		OrdersService ordersService=new OrdersServiceImpl();
		Orders orders=ordersService.findOrdersById(1);
		System.out.println(orders);
		
	}
	
	@Test
	public void test4(){
		UserService userService=new UserServiceImpl();
		User user=new User();
		user.setPassword("852");
//		user.setUsername("电话");

//		user.setAddress("白");
		System.out.println(userService.findUserByQuery(user));
		
		
	}
	
	@Test
	public void test5(){
		UserService userService=new UserServiceImpl();
		int[] ids={5,7,6};
		userService.deleteUserIds(ids);

	}
	
	/**
	 * 查询订单的用户
	 * 一对一关系
	 */
	@Test
	public void test6(){
		OrdersService ordersService=new OrdersServiceImpl();		
		List<Orders> ordersList=ordersService.findAllOrdersAndUser();
		System.out.println(ordersList);

	}
	
	/**
	 * 打印订单信息里面包含的商品
	 * 打印所有，没有根据用户查询
	 * 一对多关系
	 */
	@Test
	public void test7(){
		OrdersService ordersService=new OrdersServiceImpl();
		
		List<Goods> goodsList=ordersService.findAllOrderGoodsUserByUsername();
		System.out.println(goodsList);

	}
	
	
}
