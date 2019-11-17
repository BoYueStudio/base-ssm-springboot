package com.oracle.mybatis.dao;

import java.util.List;

import com.oracle.mybatis.model.Goods;
import com.oracle.mybatis.model.Orders;

public interface OrdersDao {
public Orders findOrdersById(int id);
public List<Orders> findAllOrdersAndUser();
public List<Goods> findAllOrderGoodsUserByUsername();//²éÑ¯ËùÓÐ
}
