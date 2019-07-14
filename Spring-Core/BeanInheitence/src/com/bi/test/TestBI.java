package com.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bi.beans.Mobile;

public class TestBI {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("com/bi/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		/////////////////////////////////////
		/*Mobile one = factory.getBean("iphone1", Mobile.class);
		System.out.println(one);
		System.out.println("================");
		Mobile two = factory.getBean("iphone2", Mobile.class);
		System.out.println(two);

		System.out.println("================");
		Mobile three = factory.getBean("iphone3", Mobile.class);
		System.out.println(three);*/
		
		Mobile m = factory.getBean("basePhone",Mobile.class);
	}

}
