package com.ba.test;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.DeparmentDao;

public class TestBeanAliasing {

	public static void main(String[] args) {

		ClassPathResource resource = new ClassPathResource("com/ba/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		String[] names = factory.getAliases("deptDao");
		System.out.println(Arrays.toString(names));
		System.out.println("================");
		DeparmentDao dao = factory.getBean("d,dao", DeparmentDao.class);
		boolean status = dao.insertRecord();
		System.out.println("Is record inserted ? :" + status);
	}

}
