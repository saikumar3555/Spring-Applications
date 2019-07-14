package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.OrderManager;

public class TestOrderManager {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("com/ba/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		//////////////////////////
		OrderManager om = factory.getBean("om", OrderManager.class);
		om.processOrder();
	}
}
