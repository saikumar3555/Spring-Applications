package com.aw.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

import com.aw.beans.Car;

public class TestAutoWiring {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/aw/cfg/Beans.xml");
		Car c = context.getBean("c", Car.class);
		System.out.println(c);

	}
}
