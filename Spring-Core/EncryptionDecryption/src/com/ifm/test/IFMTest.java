package com.ifm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ifm.beans.SecurityServices;

public class IFMTest {

	public static void main(String[] args) throws Exception {
		Resource resource = new ClassPathResource("com/ifm/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		SecurityServices ss = factory.getBean("ss", SecurityServices.class);
	
		String encryptedVal = ss.encrypt("hello");
		System.out.println("Encrypted Value : " + encryptedVal);
		String decryptedVal = ss.decrypt(encryptedVal);
		System.out.println("Decrypted Value : " + decryptedVal);

	}
}
