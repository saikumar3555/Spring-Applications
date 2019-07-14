package com.bfpp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bfpp.beans.ConnectionProvider;

public class TestBFPP {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bfpp/cfg/Beans.xml");
		///////////////////////////////
		ConnectionProvider cprovider = ctx.getBean("cp", ConnectionProvider.class);
		System.out.println(cprovider);
	}

}
