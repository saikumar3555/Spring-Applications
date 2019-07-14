package com.ni.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ni.beans.Movie;

public class TestNullInjectionApp {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("com/ni/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Movie m = factory.getBean("m", Movie.class);
		System.out.println(m);
	}

}
