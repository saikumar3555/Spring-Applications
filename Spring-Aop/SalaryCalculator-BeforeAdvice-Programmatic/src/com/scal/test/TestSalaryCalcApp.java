package com.scal.test;

import org.springframework.aop.framework.ProxyFactory;

import com.scal.aspects.LoggingAspect;
import com.scal.beans.SalaryCalculator;

public class TestSalaryCalcApp {

	public static void main(String[] args) {

		ProxyFactory factory = new ProxyFactory();
		
		//Setting Target class
		factory.setTarget(new SalaryCalculator());
		
		//Setting Advice class
		factory.addAdvice(new LoggingAspect());

		//Getting Proxy class
		SalaryCalculator scalc = (SalaryCalculator) factory.getProxy();
	
		//Calling business method using proxy obj
		scalc.computeSalary("IBM001", 18000.00);
		scalc.calculateWorkingDays("IBM001");
	}

}
