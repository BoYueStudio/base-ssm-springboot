package com.oracle.spring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sun.misc.VM;

//controller注解标识这是一个处理器（类似servlet）
//扫描器扫描这个注解，帮你实例化对象
@Controller
public class TestController {
	//Requestmapping注解是将url和一个方法进行绑定，
	//当访问url时会调用该处理器的方法进行处理
	@RequestMapping("/test1.do")
	public void test1(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().write("这是一个处理器的方法");
	}
	
	//Headler处理业务逻辑代码，返回一个ModelAndView到dispatherservlet
	//ModelAndView 对象里面封装的是响应的数据和视图地址
	@RequestMapping("test2.do")
	public ModelAndView test2(String uname){
		ModelAndView mv=new ModelAndView();
		mv.addObject("uname",uname);
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping("/test3.do")
	public String test3(){
		return "login";
	}
}
