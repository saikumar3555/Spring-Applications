package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.PrintMsg;

public class TestBPP {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bpp/cfg/Beans.xml");

		/*
		 * ClassPathResource res = new
		 * ClassPathResource("com/bpp/cfg/Beans.xml"); BeanFactory factory = new
		 * XmlBeanFactory(res);
		 */
		PrintMsg pm = ctx.getBean("pm", PrintMsg.class);
		System.out.println(pm);
	}
}
