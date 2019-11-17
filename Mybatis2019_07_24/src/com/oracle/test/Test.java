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
	//新增user
	//insert 第一个条件：要知道sql语句在哪儿，第二：传递的参数
	//User user=new User("老白", "543", "长白山", "65432", "先生");
	//session.insert("user.insertUser",user);
	
	//根据id删除
	//session.delete("user.deleteUserById",3);
	
	//更改user
	//User user=new User(1, "老黑二代","6543", "非洲","7654", "nv");
	//session.update("user.updeteUserById",user);
	
	
	//根据id查询用户
	//User user=session.selectOne("user.selectUserById", 1);
	//System.out.println(user);
	
	//查询返回的是多条信息
	//List<User> userList=session.selectList("user.selectAllUser");
	//System.out.println(userList);
	
	//插入数据回填id
	//User user=new User("老黑san代","6543", "非洲","7654", "nv");
	//session.insert("user.insertUser2",user);
	//System.out.println("userid值："+user.getId());
	
	List<User> userList=session.selectList("user.findUserByName","黑");
	System.out.println(userList);
	session.commit();
	
}
}
