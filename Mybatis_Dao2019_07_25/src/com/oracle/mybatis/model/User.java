package com.oracle.mybatis.model;

import java.io.Serializable;

public class User implements Serializable {
private Integer id;
private String username;
private String password;
private String address;
private String phone;
private String sex;


@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address + ", phone="
			+ phone + ", sex=" + sex + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public User(Integer id, String username, String password, String address, String phone, String sex) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.address = address;
	this.phone = phone;
	this.sex = sex;
}
public User() {
	super();
}
public User(String username, String password, String address, String phone, String sex) {
	super();
	this.username = username;
	this.password = password;
	this.address = address;
	this.phone = phone;
	this.sex = sex;
}



}
