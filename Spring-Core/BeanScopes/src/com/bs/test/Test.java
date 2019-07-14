package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.beans.Car;

public class Test {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("com/bs/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Car c1 = factory.getBean("c", Car.class);
		System.out.println(c1.hashCode());
		Car c2 = factory.getBean("c", Car.class);
		System.out.println(c2.hashCode());
	}
}
