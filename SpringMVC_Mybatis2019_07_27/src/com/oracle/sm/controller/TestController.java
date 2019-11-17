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

	//测试插入user表
	@Test
	public void test1(){
		UserService userService=new UserServiceImpl();
		User user=new User("boyue","654", "威信");
		userService.insertUser(user);
	}
	
	//根据id查找user
	@Test
	public void test2(){
		UserService userService=new UserServiceImpl();
	
		User user=userService.findUserById(1);
		System.out.println(user);
	}
	
	
	//根据name查找User
	@Test
	public void test3(){
		UserService userService=new UserServiceImpl();
	
		User user=userService.findUserByUsername("boyue");
		System.out.println(user);
	}
	
	//查找所有商品
	@Test
	public void test4(){
		GoodsService goodsService=new GoodsServiceImpl();
		System.out.println(goodsService.findAllGoods());
	}
	
	//查找所有商品的总条数
	@Test
	public void test5(){
		GoodsService goodsService=new GoodsServiceImpl();
		System.out.println(goodsService.findPageCountByPagesize(2));
	}
	
	//分页查找商品
		@Test
		public void test6(){
			GoodsService goodsService=new GoodsServiceImpl();
			Page page=new Page(1, 2);
			System.out.println(goodsService.findGoodsByPage(page));
		}
		
		//根据id删除商品
		@Test
		public void test7(){
			GoodsService goodsService=new GoodsServiceImpl();
			
			System.out.println(goodsService.deleteGoodsById(4));
		}
		
		//add商品
		@Test
		public void test8(){
			GoodsService goodsService=new GoodsServiceImpl();
			Goods goods=new Goods("ddd", "543", "653", 1);
			System.out.println(goodsService.addGoods(goods));
		}
		
		//根据id查找商品
		@Test
		public void test9(){
			GoodsService goodsService=new GoodsServiceImpl();
			//	SerchPrice serchPrice=new SerchPrice(8,999);
			//System.out.println(goodsService.findGoodsByPrice(serchPrice));
		}
		
		//根据name模糊查找商品
	@Test
	public void test10() {
		GoodsService goodsService = new GoodsServiceImpl();

		System.out.println(goodsService.findGoodsByLikeName("多"));
	}
	
	//根据update商品
@Test
public void test11() {
	GoodsService goodsService = new GoodsServiceImpl();
Goods goods=new Goods(20, "dumai","88","ddd", 1);
	System.out.println(goodsService.updateGoodsById(goods));
}

//根据ids 批量商品
@Test
public void test12() {
GoodsService goodsService = new GoodsServiceImpl();
String[] dd={"19","20"};
System.out.println(goodsService.deleteAllGoods(dd));
}

}
