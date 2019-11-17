package com.oracle.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.oracle.spring.model.Goods;
import com.oracle.spring.service.GoodsService;

@Component
public class GoodsController {
	
	@Autowired
	public GoodsService goodsService;
	
	public Goods findGoodsById(int id){
		return goodsService.findGoodsById(2);
	}
	

}
