package com.mc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mc.beans.ReportGenerator;
import com.mc.util.Monitor;

public class TestMethodCallCount {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/mc/cfg/Aop-Beans.xml");
		
		ReportGenerator rg   = ctx.getBean("rg",ReportGenerator.class);
		
		rg.generateReport();
		rg.generateReport();
		rg.generateReport();		
		
		System.out.println("Count : "+Monitor.getAccessCount("generateReport"));
		
	}
}
