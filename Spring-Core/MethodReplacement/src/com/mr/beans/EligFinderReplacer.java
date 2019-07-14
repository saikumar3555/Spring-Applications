package com.mr.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class EligFinderReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method m, Object[] args) throws Throwable {
		System.out.println("Orginal Method ARgs : " + Arrays.toString(args));
		if (m.getName().equals("findEligibility")) {
			System.out.println("Getting data from DB");
			System.out.println("Marshalling the data...");
			System.out.println("Executing business rules with Drools Rule Engine..!!");
			System.out.println("Approved");
		}
		return obj;
	}

}
