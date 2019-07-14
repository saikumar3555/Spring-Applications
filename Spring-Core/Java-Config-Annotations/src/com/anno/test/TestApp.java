package com.anno.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.beans.Car;

public class TestApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"com/anno/cfg/application-Context.xml");
		Car c = context.getBean("c", Car.class);
		System.out.println(c);
		context.registerShutdownHook();

	}
}
