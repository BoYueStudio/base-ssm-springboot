package com.oracle.utils;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
private static SqlSessionFactory sessionFactory;
static{
	try{
	InputStream in=Resources.getResourceAsStream("mybatils.xml");
	sessionFactory=new SqlSessionFactoryBuilder().build(in);
	
	}catch(Exception e){
		e.printStackTrace();
	}
}
public static SqlSessionFactory getSessionFactory() {
	return sessionFactory;
}
public static void setSessionFactory(SqlSessionFactory sessionFactory) {
	MybatisUtil.sessionFactory = sessionFactory;
}

}
