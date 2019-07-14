package com.ifm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ifm.beans.DeptService;

public class TestIFM {

	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource("com/ifm/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		DeptService service = factory.getBean("deptService", DeptService.class);
		service.save(101, "Development");

	}

}
