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

		System.out.println("���봦����֮ǰ������������");
		
		String path=arg0.getRequestURI();
		if(path.contains("login")){
			return true;//��¼ҳ��
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
		System.out.println("������������֮�󷵻�modelandview��dispatherservlet֮ǰ����");
		
	}
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	 System.out.println("��ͼ��Ⱦ��ϣ�����ȫ������");
	 if(arg3!=null){
		 logger.error(arg3.getMessage());
	 }
		
	}

	

}
