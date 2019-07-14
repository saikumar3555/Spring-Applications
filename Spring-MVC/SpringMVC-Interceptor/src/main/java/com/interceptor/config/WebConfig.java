package com.interceptor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.interceptor.util.BrowserCheckInterceptor;
import com.interceptor.util.ExecutionTimeInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.interceptor.controller" })
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver createViewResolver() {
		InternalResourceViewResolver res = new InternalResourceViewResolver();
		res.setPrefix("/WEB-INF/views/");
		res.setSuffix(".jsp");
		return res;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new ExecutionTimeInterceptor());
		registry.addInterceptor(new BrowserCheckInterceptor());
	}
}
