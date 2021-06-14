package com.nt.interceptor;

import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component("tci")
public class TimeCheckingInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		LocalTime time=LocalTime.now();
		
		int hours=time.getHour();
		
		if(hours>9 && hours<15) {
			
			return true;
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/pages/timeout.jsp");
			rd.forward(request, response);
			
			return false;
		}
		
	}
	
}
