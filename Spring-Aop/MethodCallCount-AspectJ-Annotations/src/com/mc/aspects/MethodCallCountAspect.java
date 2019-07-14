package com.mc.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import com.mc.util.Monitor;

@Aspect
public class MethodCallCountAspect {

	@Pointcut(value = "execution(* com.mc.beans.*.*(..))")
	public void pce() {
	}

	@Order(value = 1)
	@Before(value = "pce()")
	public void monitor(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		Monitor.increment(methodName);
	}

	@Around(value = "pce()")
	public Object around(ProceedingJoinPoint pjp) {
		Object obj = null;
		try {
			System.out.println("Before method");
			obj = pjp.proceed();
			System.out.println("AFter method");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
}
