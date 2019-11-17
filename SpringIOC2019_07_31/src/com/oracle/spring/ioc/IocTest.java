package com.oracle.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

	public static void main(String[] args) {
		
		//����ioc����
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		//  ͨ�������Ψһ��ʶȡ����
		UserService userService=(UserService) applicationContext.getBean("UserService");
		
		//��ioc�в���idΪUserService��bean
		System.out.println(userService.findUserById(4));
		
		// ͨ�����������ȥȡ�����豣֤�����͵Ķ����ǵ����������������쳣
		//�޲ι���
		//ͨ��bean��propertyȥ��ֵ���󣬸ö������Ҫ��get,set���� �������޲ι���
		User user =(User) applicationContext.getBean("user1");
		System.out.println(user);
		
		//�вι���bena
		//System.out.println(applicationContext.getBean("user3"));
		
		//������̬����
		//System.out.println(applicationContext.getBean("user4"));
	}

}
