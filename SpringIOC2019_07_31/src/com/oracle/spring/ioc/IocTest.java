package com.oracle.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

	public static void main(String[] args) {
		
		//创建ioc容器
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		//  通过对象的唯一标识取对象
		UserService userService=(UserService) applicationContext.getBean("UserService");
		
		//在ioc中查找id为UserService的bean
		System.out.println(userService.findUserById(4));
		
		// 通过对象的类型去取，必需保证该类型的对象是单例！！！否则抛异常
		//无参构造
		//通过bean的property去赋值对象，该对象必须要有get,set方法 ，还有无参构造
		User user =(User) applicationContext.getBean("user1");
		System.out.println(user);
		
		//有参构造bena
		//System.out.println(applicationContext.getBean("user3"));
		
		//工厂静态方法
		//System.out.println(applicationContext.getBean("user4"));
	}

}
