package com.ar.advices;

import org.aspectj.lang.JoinPoint;

public class LoggerAdvice {

	public void logger(JoinPoint jp, Object retVal) {
		String methodName = jp.getSignature().getName();
		System.out.println("Execution completed for : " + methodName);
		System.out.println(methodName + " has returned : " + retVal);

	}

}
