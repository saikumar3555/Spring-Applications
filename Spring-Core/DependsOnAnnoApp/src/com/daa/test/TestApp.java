package com.daa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.daa.beans.A;
import com.daa.cfg.AppConfig;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		A a = ctx.getBean("a",A.class);
	}

}
