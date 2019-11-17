package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.aop.service.UserService;

public class Test1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-aop.xml");
		UserService userService=context.getBean(UserService.class);
		//userService这个对象是userServiceImpl的动态代理对象
		/**	
		 * 当ioc实列化bean的时候，
		 * 如果该bean满足aop切面配置，spring的ioc会默认使用jdk的动态代理
* 来创建一个动态代理对象，先进行前置增强，在执行原业务类方法，最后在进行后置增强
* 
         * 如果原业务不实现接口的话，spring会使用cglib进行动态代理
         * 如果强制使用cglib的话，所有的动态代理都是基于cglib
		 */
		
		//userService.deleteUserById(3);
		userService.updateUserById(3);
	}

}
