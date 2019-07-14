package com.nb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nb.beans.Fuel;
import com.nb.beans.Rocket;

public class TestNestedBeanFactory {
	public static void main(String[] args) {
		ClassPathResource res1 = new ClassPathResource("com/nb/cfg/Parent-Beans.xml");
		BeanFactory pFactory = new XmlBeanFactory(res1);
		Fuel f = pFactory.getBean("f", Fuel.class);
		System.out.println(f);

		ClassPathResource res2 = new ClassPathResource("com/nb/cfg/Child-Beans.xml");
		BeanFactory cFactory = new XmlBeanFactory(res2, pFactory);
		Rocket r = cFactory.getBean("r", Rocket.class);
		System.out.println(r);
		
		ConfigurableListableBeanFactory cbfactory  = (ConfigurableListableBeanFactory)cFactory;
		int cnt= cbfactory.getBeanDefinitionCount();
		System.out.println(cnt);
	}

}
