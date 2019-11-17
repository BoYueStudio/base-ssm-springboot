package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.aop.model.User;
import com.oracle.aop.service.UserService;


public class Test3 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-aop.xml");
		UserService userService=context.getBean(UserService.class);
		//userService.deleteUserById(3);
		//userService.addUser(new User());
	    userService.updateUserById(44);
		userService.addUser(new User());
	}

}
