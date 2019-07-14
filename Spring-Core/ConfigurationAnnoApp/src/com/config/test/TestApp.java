package com.config.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.beans.AppConfiguration;
import com.config.beans.Car;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Car c = context.getBean(Car.class);
		c.drive();

	}
}
