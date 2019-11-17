package com.oracle.aop.memorylog;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class LogAdvice {

	public void after(JoinPoint  joinpoint,Object object) {
		   String methodname=joinpoint.getSignature().getName();
		   String  tablename="";  String type="";
		   if (methodname.contains("update")) {
		  		  tablename=methodname.substring(methodname.indexOf("update")+6, methodname.indexOf("By"));	
			      type="修改";
			}
		   
			if (methodname.contains("delete")) {
	        		  tablename=methodname.substring(methodname.indexOf("delete")+6, methodname.indexOf("By"));	
			      type="删除";
			}
			
			if (methodname.contains("add")) {
				
				
				if (methodname.indexOf("By")<0) {
					tablename=methodname.substring(methodname.indexOf("add")+3);	
					 type="添加";
				}
				
				else {
					
				
	  		  tablename=methodname.substring(methodname.indexOf("add")+3,  methodname.indexOf("By"));	
		      
	  		  type="添加";
				}
		}
		
			
			 Object[] arrays=joinpoint.getArgs();
			 StringBuffer rStringBuffer=new StringBuffer();
			 
			 String  param="";
			 int a=0;
			 for (Object  info:arrays) {
				 
				param=info.getClass().getName();
				param=param.substring(param.lastIndexOf(".")+1);
		
			 rStringBuffer.append("参数:"+param+",值:"+joinpoint.getArgs()[a]);
			 a++;
			 
			 
			 }
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
				Date date=new Date();
			System.out.println("方法名:"+methodname);
			System.out.println("表名字: "+tablename);
			System.out.println("操作类型:"+type);
	        System.out.println("参数类型:"+rStringBuffer);
	        System.out.println("操作时间:"+sdf.format(date));
	      if (object==null&&"".equals(object)) {
			System.out.println("此次操作无返回值");
		}   
	        else {
	        	  System.out.println("返回值:"+object);
			}
	      
		
		
		
		}


	
}
