package com.oracle.spring.ioc;

public class UserFactory {

	public static User getUser(){
		return new User(4,"¹¤³§user");
	}

}
