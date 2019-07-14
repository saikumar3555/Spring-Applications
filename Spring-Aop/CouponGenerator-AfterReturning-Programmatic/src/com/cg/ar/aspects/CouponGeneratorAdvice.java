package com.cg.ar.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class CouponGeneratorAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object retVal, Method m, Object[] args, Object t) throws Throwable {
		String methodName = m.getName();
		System.out.println("Execution completed for : " + methodName);
		System.out.println(methodName + " Returned  : " + retVal);
		if ((Double) retVal >= 5000) {
			Object mobileNo = args[0];
			System.out.println("Coupon Generated for : " + mobileNo + " Worth 1000 rs");
		}
	}
}
