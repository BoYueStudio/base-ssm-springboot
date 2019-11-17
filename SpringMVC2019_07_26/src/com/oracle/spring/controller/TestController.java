package com.oracle.spring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sun.misc.VM;

//controllerע���ʶ����һ��������������servlet��
//ɨ����ɨ�����ע�⣬����ʵ��������
@Controller
public class TestController {
	//Requestmappingע���ǽ�url��һ���������а󶨣�
	//������urlʱ����øô������ķ������д���
	@RequestMapping("/test1.do")
	public void test1(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().write("����һ���������ķ���");
	}
	
	//Headler����ҵ���߼����룬����һ��ModelAndView��dispatherservlet
	//ModelAndView ���������װ������Ӧ�����ݺ���ͼ��ַ
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
