package com.cm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cm.beans.Meeting;

public class TestCMApp {

	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource("com/cm/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		/////////////////////////////////////
		Meeting scall = factory.getBean("standUpCall", Meeting.class);
		System.out.println(scall);

		System.out.println("===================");
		Meeting statuscall = factory.getBean("statusCall", Meeting.class);
		System.out.println(statuscall);
	}
}
