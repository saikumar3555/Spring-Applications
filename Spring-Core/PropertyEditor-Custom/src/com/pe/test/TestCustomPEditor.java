package com.pe.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pe.beans.Calculator;

public class TestCustomPEditor {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/pe/cfg/Beans.xml");
		Calculator calc = ctx.getBean("calc", Calculator.class);
		calc.addNumbers();
	}
}
