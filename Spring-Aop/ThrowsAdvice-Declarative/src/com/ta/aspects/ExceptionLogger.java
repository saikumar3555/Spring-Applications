package com.ta.aspects;

public class ExceptionLogger {

	public void afterThrowing(Exception ex) {
		System.out.println("Exception occured: super ... " + ex);
		System.out.println("Sending Email...!!");
	}

	/*
	 public void afterThrowing(NullPointerException e) {
	    System.out.println("Exception occured : sub ... " + e);
	 }
	  
	 public void afterThrowing(Method m, Object[] args, Object target, NullPointerException ne) { 
		  System.out.println("Exception occured in:" + m.getName()); 
		  System.out.println("parameters : " + Arrays.toString(args));
		  System.out.println("Exception details : " + ne);
	 }
	*/
}



8074052695- Nagendra 
