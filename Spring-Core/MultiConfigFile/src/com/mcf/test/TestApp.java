package com.mcf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcf.beans.Car;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/mcf/cfg/beans1.xml", "com/mcf/cfg/beans2.xml");
		Car c = ctx.getBean("c", Car.class);
		System.out.println(c);
	}

}
