package com.oracle.sm.controller;

import org.junit.Test;

import com.oracle.sm.model.Goods;
import com.oracle.sm.model.Page;
import com.oracle.sm.model.SerchPrice;
import com.oracle.sm.model.User;
import com.oracle.sm.service.GoodsService;
import com.oracle.sm.service.UserService;
import com.oracle.sm.service.impl.GoodsServiceImpl;
import com.oracle.sm.service.impl.UserServiceImpl;
import com.sun.media.jfxmedia.events.NewFrameEvent;

public class TestController {

	//���Բ���user��
	@Test
	public void test1(){
		UserService userService=new UserServiceImpl();
		User user=new User("boyue","654", "����");
		userService.insertUser(user);
	}
	
	//����id����user
	@Test
	public void test2(){
		UserService userService=new UserServiceImpl();
	
		User user=userService.findUserById(1);
		System.out.println(user);
	}
	
	
	//����name����User
	@Test
	public void test3(){
		UserService userService=new UserServiceImpl();
	
		User user=userService.findUserByUsername("boyue");
		System.out.println(user);
	}
	
	//����������Ʒ
	@Test
	public void test4(){
		GoodsService goodsService=new GoodsServiceImpl();
		System.out.println(goodsService.findAllGoods());
	}
	
	//����������Ʒ��������
	@Test
	public void test5(){
		GoodsService goodsService=new GoodsServiceImpl();
		System.out.println(goodsService.findPageCountByPagesize(2));
	}
	
	//��ҳ������Ʒ
		@Test
		public void test6(){
			GoodsService goodsService=new GoodsServiceImpl();
			Page page=new Page(1, 2);
			System.out.println(goodsService.findGoodsByPage(page));
		}
		
		//����idɾ����Ʒ
		@Test
		public void test7(){
			GoodsService goodsService=new GoodsServiceImpl();
			
			System.out.println(goodsService.deleteGoodsById(4));
		}
		
		//add��Ʒ
		@Test
		public void test8(){
			GoodsService goodsService=new GoodsServiceImpl();
			Goods goods=new Goods("ddd", "543", "653", 1);
			System.out.println(goodsService.addGoods(goods));
		}
		
		//����id������Ʒ
		@Test
		public void test9(){
			GoodsService goodsService=new GoodsServiceImpl();
			//	SerchPrice serchPrice=new SerchPrice(8,999);
			//System.out.println(goodsService.findGoodsByPrice(serchPrice));
		}
		
		//����nameģ��������Ʒ
	@Test
	public void test10() {
		GoodsService goodsService = new GoodsServiceImpl();

		System.out.println(goodsService.findGoodsByLikeName("��"));
	}
	
	//����update��Ʒ
@Test
public void test11() {
	GoodsService goodsService = new GoodsServiceImpl();
Goods goods=new Goods(20, "dumai","88","ddd", 1);
	System.out.println(goodsService.updateGoodsById(goods));
}

//����ids ������Ʒ
@Test
public void test12() {
GoodsService goodsService = new GoodsServiceImpl();
String[] dd={"19","20"};
System.out.println(goodsService.deleteAllGoods(dd));
}

}
