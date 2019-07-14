package com.scal.aspects;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAspect implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] args, Object target) throws Throwable {
		String methodName = m.getName();
		System.out.println("Execution started for : " + methodName);
		System.out.println("Method Paramters : " + Arrays.toString(args));
		args[0] = "IBM0002";
	}

}
