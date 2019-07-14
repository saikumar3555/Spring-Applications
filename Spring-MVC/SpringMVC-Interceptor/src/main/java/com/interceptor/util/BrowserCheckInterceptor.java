package com.interceptor.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BrowserCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String browserName = request.getHeader("user-agent");

		if (browserName.contains("Chrome")) {
			response.sendRedirect("invalidBrowser.jsp");
			return false;
		}
		return true;
	}
}
