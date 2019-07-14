package com.ca.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ca.beans.Student;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ca/cfg/Beans.xml");
		Student s = ctx.getBean(Student.class);
		System.out.println(s);
	}

}
