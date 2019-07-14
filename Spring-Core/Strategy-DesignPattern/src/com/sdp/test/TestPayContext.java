package com.sdp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sdp.beans.PaymentContext;

public class TestPayContext {
	public static void main(String[] args) throws Exception {
		ClassPathResource res = new ClassPathResource("com/sdp/cfg/Beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		PaymentContext ctx = factory.getBean("pcontext", PaymentContext.class);
		ctx.payBill(45000.00);
	}
}
