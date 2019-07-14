package com.lmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lmi.beans.TokenGenerator;

public class TestTokenGeneratorApp {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("com/lmi/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		//////////////////////////////
		TokenGenerator tg = factory.getBean("tg", TokenGenerator.class);
		System.out.println(tg.getToken().hashCode());
		System.out.println(tg.getToken().hashCode());
	}
}
