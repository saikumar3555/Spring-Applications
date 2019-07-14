package com.ib.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ib.beans.ATM;
import com.ib.beans.HPPrinter;

public class ATMTest {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("com/ib/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		/////////////////////////////////////////
		/*ATM atm = factory.getBean("atm", ATM.class);
		atm.checkBal(6868);*/
		
		factory.getBean("hpp",HPPrinter.class);
	}

}
