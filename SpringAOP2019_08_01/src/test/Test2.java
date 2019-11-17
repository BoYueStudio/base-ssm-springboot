package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.aop.service.UserService;
import com.oracle.aop.service.impl.GoodsServiceImpl;

public class Test2 {

	public static void main(String[] args) {
		//new GoodsServiceImpl().findGoodsById(3);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-aop.xml");
		GoodsServiceImpl goodsServiceImpl=context.getBean(GoodsServiceImpl.class);
		goodsServiceImpl.findGoodsById(44);
	}

}
