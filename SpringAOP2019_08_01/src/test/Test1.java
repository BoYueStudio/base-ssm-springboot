package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oracle.aop.service.UserService;

public class Test1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-aop.xml");
		UserService userService=context.getBean(UserService.class);
		//userService���������userServiceImpl�Ķ�̬�������
		/**	
		 * ��iocʵ�л�bean��ʱ��
		 * �����bean����aop�������ã�spring��ioc��Ĭ��ʹ��jdk�Ķ�̬����
* ������һ����̬��������Ƚ���ǰ����ǿ����ִ��ԭҵ���෽��������ڽ��к�����ǿ
* 
         * ���ԭҵ��ʵ�ֽӿڵĻ���spring��ʹ��cglib���ж�̬����
         * ���ǿ��ʹ��cglib�Ļ������еĶ�̬�����ǻ���cglib
		 */
		
		//userService.deleteUserById(3);
		userService.updateUserById(3);
	}

}
