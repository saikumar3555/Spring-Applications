package com.ws.pc.aspects;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggerAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] args, Object target) throws Throwable {
		System.out.println("Execution started For : " + m.getName());
		System.out.println("Arguments of : " + m.getName() + " : " + Arrays.toString(args));
	}

}
