package com.usa.fr.advices;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAdvice {

	public Object monitor(ProceedingJoinPoint pjp) throws Throwable {

		String methodName = pjp.getSignature().getName();
		System.out.println("Execution starting for : " + methodName);
		long start = System.currentTimeMillis();

		// Invoke target method to execute business logic
		Object retVal = pjp.proceed();

		long end = System.currentTimeMillis();

		long diff = end - start;

		System.out.println("Execution Ended for : " + methodName);
		System.out.println("Total Time taken to complete : " + diff);
		return retVal;
	}

}
