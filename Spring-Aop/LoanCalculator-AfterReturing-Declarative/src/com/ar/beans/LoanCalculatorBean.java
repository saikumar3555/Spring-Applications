package com.ar.beans;

public class LoanCalculatorBean {

	public double computeLoanAmt(double p, int t, double r) {
		System.out.println("Computing loan amount...");
		return (p * t * r) / 100;
	}

}
