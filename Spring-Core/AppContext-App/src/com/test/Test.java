package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Car;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/cfg/Beans.xml");
		
		/*Car c = ctx.getBean("c", Car.class);
		System.out.println(c);*/

	}

}
