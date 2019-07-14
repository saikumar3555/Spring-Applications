package com.cg.ar.test;

import org.springframework.aop.framework.ProxyFactory;

import com.cg.ar.aspects.CouponGeneratorAdvice;
import com.cg.ar.beans.ShoppingCartBean;

public class TestCouponGenerator {

	public static void main(String[] args) {

		ProxyFactory factory = new ProxyFactory();

		// Setting Target bean
		factory.setTarget(new ShoppingCartBean());

		// Setting advice bean
		factory.addAdvice(new CouponGeneratorAdvice());

		// Getting proxy obj
		ShoppingCartBean bean = (ShoppingCartBean) factory.getProxy();

		// calling business method from proxy
		bean.computeBillAmt(99797979l);
		bean.m1(88080);
	}

}
