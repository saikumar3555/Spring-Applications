package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Robot;

public class TestBeanAutowiring {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("com/ba/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Robot r = factory.getBean("r", Robot.class);
		System.out.println(r);

	}

}
