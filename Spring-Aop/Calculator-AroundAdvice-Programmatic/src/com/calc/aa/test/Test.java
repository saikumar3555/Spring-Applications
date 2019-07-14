package com.calc.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.calc.aa.aspects.AroundAdvice;
import com.calc.aa.beans.Calculator;

public class Test {

	public static void main(String[] args) {

		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new Calculator());
		factory.addAdvice(new AroundAdvice());
		Calculator calc = (Calculator) factory.getProxy();
		int result = calc.add(10, 20);
		System.out.println("Sum : " + result);

	}

}
