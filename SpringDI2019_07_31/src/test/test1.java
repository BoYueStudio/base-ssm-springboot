package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.spring.controller.UserController;
import com.oracle.spring.service.UserService;

public class test1 {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		
		UserService userService=(UserService) applicationContext.getBean("UserService");
		System.out.println(userService.findUserById(33));
		
		//System.out.println(new UserController().findUserById(44));验证spring的依赖注入
	}

}
