package com.oracle.mybatis.model;

import java.util.List;

public class Orders {
private int id;
private String ordersName;
private String ordersMoney;
private int ordersId;

private User user;

private List<Goods> goodsList;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getOrdersName() {
	return ordersName;
}
public void setOrdersName(String ordersName) {
	this.ordersName = ordersName;
}
public String getOrdersMoney() {
	return ordersMoney;
}
public void setOrdersMoney(String ordersMoney) {
	this.ordersMoney = ordersMoney;
}
public int getOrdersId() {
	return ordersId;
}
public void setOrdersId(int ordersId) {
	this.ordersId = ordersId;
}
public Orders(String ordersName, String ordersMoney, int ordersId) {
	super();
	this.ordersName = ordersName;
	this.ordersMoney = ordersMoney;
	this.ordersId = ordersId;
}
public Orders() {
	super();
}
@Override
public String toString() {
	return "Orders [id=" + id + ", ordersName=" + ordersName + ", ordersMoney=" + ordersMoney + ", ordersId=" + ordersId
			+ ", user=" + user + ", goodsList=" + goodsList + "]";
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Orders(int id, String ordersName, String ordersMoney, int ordersId, User user) {
	super();
	this.id = id;
	this.ordersName = ordersName;
	this.ordersMoney = ordersMoney;
	this.ordersId = ordersId;
	this.user = user;
}
public List<Goods> getGoodsList() {
	return goodsList;
}
public void setGoodsList(List<Goods> goodsList) {
	this.goodsList = goodsList;
}




}
