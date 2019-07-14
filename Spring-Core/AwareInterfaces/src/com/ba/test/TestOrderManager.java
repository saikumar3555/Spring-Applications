package com.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ba.beans.OrderManager;

public class TestOrderManager {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ba/cfg/Beans.xml");
		OrderManager om = ctx.getBean("om", OrderManager.class);
		om.processOrder();
	}
}
