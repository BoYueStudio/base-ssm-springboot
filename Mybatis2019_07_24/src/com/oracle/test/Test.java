package com.oracle.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.oracle.model.User;



public class Test {
public static void main(String[] args) throws IOException{
	
	InputStream in=Resources.getResourceAsStream("mybatils.xml");
	SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(in);
	SqlSession session=sessionFactory.openSession();
	//����user
	//insert ��һ��������Ҫ֪��sql������Ķ����ڶ������ݵĲ���
	//User user=new User("�ϰ�", "543", "����ɽ", "65432", "����");
	//session.insert("user.insertUser",user);
	
	//����idɾ��
	//session.delete("user.deleteUserById",3);
	
	//����user
	//User user=new User(1, "�Ϻڶ���","6543", "����","7654", "nv");
	//session.update("user.updeteUserById",user);
	
	
	//����id��ѯ�û�
	//User user=session.selectOne("user.selectUserById", 1);
	//System.out.println(user);
	
	//��ѯ���ص��Ƕ�����Ϣ
	//List<User> userList=session.selectList("user.selectAllUser");
	//System.out.println(userList);
	
	//�������ݻ���id
	//User user=new User("�Ϻ�san��","6543", "����","7654", "nv");
	//session.insert("user.insertUser2",user);
	//System.out.println("useridֵ��"+user.getId());
	
	List<User> userList=session.selectList("user.findUserByName","��");
	System.out.println(userList);
	session.commit();
	
}
}
