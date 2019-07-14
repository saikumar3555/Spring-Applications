package com.nit.books.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	public Object invoke(ProceedingJoinPoint pjp) throws Throwable {

		// before logic
		String methodName = pjp.getSignature().getName();
		System.out.println("Execution started for ::" + methodName);
		long start = System.currentTimeMillis();
		// After logic
		Object val = pjp.proceed();
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("Execution completed for :: " + methodName);
		System.out.println("Total time taken in ms :: " + diff);
		return val;
	}

}
