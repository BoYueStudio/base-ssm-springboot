package com.oracle.spring.service;

import org.springframework.stereotype.Service;

import com.oracle.spring.model.Goods;


public interface GoodsService {

	Goods findGoodsById(int id);

}
