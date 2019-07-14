package com.ashok.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@Import(MyViewConfig.class)
public class MyWebConfig {

	@Bean
	public TradeController tradeController() {
		return new TradeController();
	}

	@Bean
	@Scope(WebApplicationContext.SCOPE_SESSION)
	public Visitor visitor(HttpServletRequest request) {
		return new Visitor(request.getRemoteAddr());
	}
}