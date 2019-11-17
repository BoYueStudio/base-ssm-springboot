package com.oracle.aop.enhance;

public class UserEnhance {

	public void beginEnhance(){
		System.out.println("开启事务管理，设置手动提交数据");
	}
	
	public void afterEnhance(){
		System.out.println("提交数据，关闭事务管理");
	}

}
