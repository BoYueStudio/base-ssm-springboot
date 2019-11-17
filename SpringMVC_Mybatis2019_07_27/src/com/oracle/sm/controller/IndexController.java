package com.oracle.sm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.sm.model.Goods;
import com.oracle.sm.service.GoodsService;
import com.oracle.sm.service.impl.GoodsServiceImpl;
import com.sun.org.apache.bcel.internal.generic.ISTORE;

@Controller
public class IndexController {
	@RequestMapping("/index.do")
	public void test1(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		GoodsService goodsService=new GoodsServiceImpl();
		List<Goods> goodsList=goodsService.findAllGoods();
		req.setAttribute("goodsList", goodsList);
		req.getRequestDispatcher("allgoods.do").forward(req, resp);
	}


}
