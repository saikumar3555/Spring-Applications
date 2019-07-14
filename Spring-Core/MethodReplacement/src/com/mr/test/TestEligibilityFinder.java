package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.EligibilityFinder;

public class TestEligibilityFinder {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("com/mr/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		EligibilityFinder efinder = factory.getBean("ef", EligibilityFinder.class);
		efinder.findEligibility("SNAP");
	}
}
