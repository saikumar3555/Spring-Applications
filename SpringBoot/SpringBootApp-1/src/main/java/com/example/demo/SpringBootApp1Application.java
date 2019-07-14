package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.WelcomeService;

@SpringBootApplication
public class SpringBootApp1Application {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootApp1Application.class, args);
		
		WelcomeService ws = ctx.getBean(WelcomeService.class);
		
		System.out.println(ws.wishMsg());
	}
}
