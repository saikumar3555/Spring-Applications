package com.ta.aspects;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLogger implements ThrowsAdvice {

	public void afterThrowing(Exception e) {
		System.out.println("Exception occured: super ... " + e);
		System.out.println("Sending Email...!!");
	}

	/*public void afterThrowing(NullPointerException e) {
		System.out.println("Exception occured : sub ... " + e);
	}

	public void afterThrowing(Method m, Object[] args, Object target, NullPointerException ne) {
		System.out.println("Exception occured in:" + m.getName());
		System.out.println("parameters : " + Arrays.toString(args));
		System.out.println("Exception details : " + ne);
	}*/
}
