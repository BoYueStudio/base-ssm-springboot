package com.oracle.sm.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.oracle.sm.model.Goods;
import com.oracle.sm.model.SerchPrice;
import com.oracle.sm.model.User;
import com.oracle.sm.service.GoodsService;
import com.oracle.sm.service.UserService;
import com.oracle.sm.service.impl.GoodsServiceImpl;
import com.oracle.sm.service.impl.UserServiceImpl;

@Controller
public class LoginController {
	
	@RequestMapping("/tologin.do")
	public String toLogin(){
		System.out.println("我是拦截器，正在处理业务逻辑");
		return "login";
	}
	//登录
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public @ResponseBody User login(@RequestBody User user,HttpServletRequest req){
		UserService userService=new UserServiceImpl();
		User user2=userService.findUserByUsername(user.getUsername());
		if(user2!=null){
			if(user2.getPassword().equals(user.getPassword())){
				req.getSession().setAttribute("user", user);
				return user;
			}else{
				return null;//密码错误
			}
		}else{
			return user2;//用户错误null
		}
		
		
	}
	
	private String[] value(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	//查询所有商品
	@RequestMapping("allgoods.do")
	public String allGoods(HttpServletRequest req){
		GoodsService goodsService=new GoodsServiceImpl();
		List<Goods> goodsList=goodsService.findAllGoods();
		req.setAttribute("goodsList", goodsList);
		return "index";
	}
	
	//删除商品
	@RequestMapping("delete.do")
	public String delete(HttpServletRequest req){
		GoodsService goodsService=new GoodsServiceImpl();
		String id=req.getParameter("id");
		goodsService.deleteGoodsById(Integer.parseInt(id));
		
		return "redirect:allgoods.do";
		
	}
	
	
	//批量删除商品
	@RequestMapping("deleteCheckGoods.do")
	public String deleteCheckGoods(String ids){
		GoodsService goodsService=new GoodsServiceImpl();
		String[] array=ids.split("-");
		System.out.println(ids);
		System.out.println(Arrays.toString(array));
		goodsService.deleteAllGoods(array);
		
		return "redirect:allgoods.do";
		
	}
	
	//前往增加商品页面
	@RequestMapping("toAddGoods.do")
	public String toAddGoods(){
		
		return "addGoods";
	}
	
	//增加商品
	@RequestMapping("addGoods.do")
	public String addGoods(Goods goods,MultipartFile file) throws IllegalStateException, IOException{
		String fileName=file.getOriginalFilename();
		String suffixName=fileName.substring(fileName.lastIndexOf("."));
		String newName=UUID.randomUUID().toString()+suffixName;
		
		String diskPath="f:/pic/";
		file.transferTo(new File(diskPath+newName));
		
		goods.setGoodsPic("/pic/"+newName);
		GoodsService goodsService=new GoodsServiceImpl();
		goodsService.addGoods(goods);
		return "redirect:allgoods.do";
	}
	//前往修改商品页面
	@RequestMapping("findGoodsById.do")
	public ModelAndView findGoodsById(int id){
		GoodsService goodsService=new GoodsServiceImpl();
		Goods goods=goodsService.findGoodsById(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("goods", goods);
		mv.setViewName("findGoodsById");
		return mv;
	}
	
	@RequestMapping("updateGoods.do")
	public String updateGoods(Goods goods,MultipartFile file) throws IllegalStateException, IOException{
		
	
		if(file.getSize()!=0){
		String fileName=file.getOriginalFilename();
		String suffixName=fileName.substring(fileName.lastIndexOf("."));
		String newName=UUID.randomUUID().toString()+suffixName;
		
		String diskPath="f:/pic/";
		file.transferTo(new File(diskPath+newName));
		
		goods.setGoodsPic("/pic/"+newName);
		}
		
		GoodsService goodsService=new GoodsServiceImpl();
		goodsService.updateGoodsById(goods);
		return "redirect:allgoods.do";
	}
	
	//价格搜索
	@RequestMapping("seacherGoodsByPrice.do")
	public ModelAndView seacherGoodsByPrice(SerchPrice serchPrice){
		System.out.println(serchPrice);
		GoodsService goodsService=new GoodsServiceImpl();
		List<Goods> goodsList=goodsService.findGoodsByPrice(serchPrice);
		ModelAndView mv=new ModelAndView();
		mv.addObject("goodsList", goodsList);
		mv.addObject("serchPrice",serchPrice);
		mv.setViewName("index");
		return mv;
	}
	
	//likeName搜索
	@RequestMapping("seacherGoodsByLikeName.do")
	public ModelAndView seacherGoodsByLikeName(String likename){
		GoodsService goodsService=new GoodsServiceImpl();
		List<Goods> goodsList=goodsService.findGoodsByLikeName(likename);
		ModelAndView mv=new ModelAndView();
		mv.addObject("goodsList", goodsList);
		mv.setViewName("index");
		return mv;
	}
	
	//@pathvariable去路径中取变量
	@RequestMapping("/getJsonGoods/{id}")
	public @ResponseBody Goods getJsonGoods(@PathVariable("id") int id){
		
		GoodsService goodsService=new GoodsServiceImpl();
		
		return goodsService.findGoodsById(id);
	}

}
