package com.sf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sf.beans.DateUtils;

public class TestSF {

	public static void main(String[] args) {

		ClassPathResource resource = new ClassPathResource("com/sf/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		////////////////////////////////
		DateUtils du = factory.getBean("du", DateUtils.class);
		//du.getDate();
		//du.getLastDay();
		//du.getFirstDay();
		//du.getNextMnthFirstDay();
		du.firstAndLastDatesFromGvnDt("02/Feb/2018","dd/MMM/yyyy");
	}

}
