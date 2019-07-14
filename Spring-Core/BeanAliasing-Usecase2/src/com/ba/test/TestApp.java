package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.DashboardService;

public class TestApp {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("com/ba/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		///////////////////////////////////
		DashboardService service = factory.getBean("ds", DashboardService.class);
		service.generateReport();
	}

}
