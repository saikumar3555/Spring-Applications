package com.dpo.test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dpo.beans.LoanCalculator;

public class TestApp {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("com/dpo/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		LoanCalculator loanCalc = factory.getBean("lc", LoanCalculator.class);
		loanCalc.computeEmi(600000, 3, "TCS");
	
		Date d = new Date();
	}
}
