package com.calc.aa.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		String methodName = mi.getMethod().getName();
		Object[] args = mi.getArguments();
		System.out.println("Method Name : " + methodName);
		System.out.println("Method args : " + args);

		// changing target method parameters
		args[0] = 50;
		args[1] = 100;

		System.out.println("-----Invoking target start --------");
		// To invoke Target method
		Object retVal = mi.proceed();
		System.out.println("-----Invoking target end --------");

		System.out.println("Target method retval : " + retVal);

		// Modifying returned value
		retVal = 250;

		return retVal;
	}

}
