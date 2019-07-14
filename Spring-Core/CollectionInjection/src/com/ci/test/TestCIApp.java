package com.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ci.beans.Person;

public class TestCIApp {
	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("com/ci/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		//////////////////////////////////
		Person p = factory.getBean("p", Person.class);
		System.out.println(p.toString());
	}
}
