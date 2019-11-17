package com.oracle.spring.service.impl;

import org.springframework.stereotype.Service;

import com.oracle.spring.model.Goods;
import com.oracle.spring.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Override
	public Goods findGoodsById(int id) {
		// TODO Auto-generated method stub
		return new Goods(22,"¿É¿Ú¿ÉÀÖ");
	}

	

}
