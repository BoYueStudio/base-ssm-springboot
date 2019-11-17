package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.spring.controller.GoodsController;
import com.oracle.spring.service.GoodsService;

public class test2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring2.xml");
		GoodsController goodsController=applicationContext.getBean(GoodsController.class);
		System.out.println(goodsController.findGoodsById(555));
	}

}
