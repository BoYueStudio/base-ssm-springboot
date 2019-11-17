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
			      type="�޸�";
			}
		   
			if (methodname.contains("delete")) {
	        		  tablename=methodname.substring(methodname.indexOf("delete")+6, methodname.indexOf("By"));	
			      type="ɾ��";
			}
			
			if (methodname.contains("add")) {
				
				
				if (methodname.indexOf("By")<0) {
					tablename=methodname.substring(methodname.indexOf("add")+3);	
					 type="���";
				}
				
				else {
					
				
	  		  tablename=methodname.substring(methodname.indexOf("add")+3,  methodname.indexOf("By"));	
		      
	  		  type="���";
				}
		}
		
			
			 Object[] arrays=joinpoint.getArgs();
			 StringBuffer rStringBuffer=new StringBuffer();
			 
			 String  param="";
			 int a=0;
			 for (Object  info:arrays) {
				 
				param=info.getClass().getName();
				param=param.substring(param.lastIndexOf(".")+1);
		
			 rStringBuffer.append("����:"+param+",ֵ:"+joinpoint.getArgs()[a]);
			 a++;
			 
			 
			 }
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
				Date date=new Date();
			System.out.println("������:"+methodname);
			System.out.println("������: "+tablename);
			System.out.println("��������:"+type);
	        System.out.println("��������:"+rStringBuffer);
	        System.out.println("����ʱ��:"+sdf.format(date));
	      if (object==null&&"".equals(object)) {
			System.out.println("�˴β����޷���ֵ");
		}   
	        else {
	        	  System.out.println("����ֵ:"+object);
			}
	      
		
		
		
		}


	
}
