package com.ar.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ar.beans.LoanCalculatorBean;

public class TestLocanCalculator {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ar/cfg/Aop-Beans.xml");
		LoanCalculatorBean calc = ctx.getBean("lcalc", LoanCalculatorBean.class);
		double i = calc.computeLoanAmt(100000, 12, 2);
		System.out.println("Intrest Amount : " + i);

	}

}
