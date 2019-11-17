package com.oracle.sm.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SessionIntercpter implements HandlerInterceptor{
private Logger logger=LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {

		System.out.println("进入处理器之前被拦截器拦截");
		
		String path=arg0.getRequestURI();
		if(path.contains("login")){
			return true;//登录页面
		}else{
			HttpSession session=arg0.getSession(false);
			if(session!=null){
				if(session.getAttribute("user")!=null){
					return true;
				}else{
					arg1.sendRedirect("tologin.do");	
					return false;
				}
			}else{
				arg1.sendRedirect("tologin.do");
				return false;
			}
		}
		
		
		

	}
	 
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("处理器出来完之后返回modelandview给dispatherservlet之前拦截");
		
	}
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	 System.out.println("视图渲染完毕，请求全部结束");
	 if(arg3!=null){
		 logger.error(arg3.getMessage());
	 }
		
	}

	

}
