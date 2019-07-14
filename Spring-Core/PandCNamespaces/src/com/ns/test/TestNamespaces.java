package com.ns.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ns.beans.BankAccount;

public class TestNamespaces {

	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource("com/ns/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		BankAccount acc = factory.getBean("ba", BankAccount.class);
		System.out.println(acc);

	}

}
