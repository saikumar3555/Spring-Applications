package com.axis.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.axis.beans.BankBean;

public class TestBankBean {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/axis/cfg/Aop-Beans.xml");
		BankBean bank = ctx.getBean("bank", BankBean.class);
		bank.deposit(79797979, 5000.00);
		System.out.println("==============");
		bank.withdraw(80997979, 10000.00);

	}

}
