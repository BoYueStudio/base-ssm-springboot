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
		User user=new User("����", "6543", "�����ϴ��", "8765432", "��");
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
//		user.setUsername("�绰");

//		user.setAddress("��");
		System.out.println(userService.findUserByQuery(user));
		
		
	}
	
	@Test
	public void test5(){
		UserService userService=new UserServiceImpl();
		int[] ids={5,7,6};
		userService.deleteUserIds(ids);

	}
	
	/**
	 * ��ѯ�������û�
	 * һ��һ��ϵ
	 */
	@Test
	public void test6(){
		OrdersService ordersService=new OrdersServiceImpl();		
		List<Orders> ordersList=ordersService.findAllOrdersAndUser();
		System.out.println(ordersList);

	}
	
	/**
	 * ��ӡ������Ϣ�����������Ʒ
	 * ��ӡ���У�û�и����û���ѯ
	 * һ�Զ��ϵ
	 */
	@Test
	public void test7(){
		OrdersService ordersService=new OrdersServiceImpl();
		
		List<Goods> goodsList=ordersService.findAllOrderGoodsUserByUsername();
		System.out.println(goodsList);

	}
	
	
}
