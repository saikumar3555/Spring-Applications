package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.Motor;

public class TestMotor {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("com/bl/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		Motor m = factory.getBean("m", Motor.class);
		m.doWork();

		ConfigurableListableBeanFactory cfactory = (ConfigurableListableBeanFactory) factory;
		cfactory.destroySingletons();

	}
}
