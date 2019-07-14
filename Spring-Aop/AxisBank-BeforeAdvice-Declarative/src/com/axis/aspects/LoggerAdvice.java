package com.axis.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class LoggerAdvice {

	public void log(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("Execution started for : " + methodName);
		System.out.println("Args of method : " + methodName + " are " + Arrays.toString(args));
	}

}
