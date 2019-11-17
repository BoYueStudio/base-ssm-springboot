package com.oracle.mybatis.service;

import java.util.List;

import com.oracle.mybatis.model.Goods;
import com.oracle.mybatis.model.Orders;

public interface OrdersService {
	public Orders findOrdersById(int id) ;
	public List<Orders> findAllOrdersAndUser();
	
	public List<Goods> findAllOrderGoodsUserByUsername();
}
