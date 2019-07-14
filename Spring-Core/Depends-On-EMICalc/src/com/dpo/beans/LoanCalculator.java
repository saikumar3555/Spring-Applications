package com.dpo.beans;

public class LoanCalculator {

	private Cache cache;

	public Double computeEmi(double p, int tenureinYears, String companyName) {
		Double emiAmt = null;
		Double yearRi = cache.get(companyName);
		if (yearRi == null) {
			try {
				throw new Exception("Company not found in the list");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		double monthlyRI = yearRi / 100 / 12;
		int tenureInMonths = tenureinYears * 12;

		double emi = (p * monthlyRI) / (1 - Math.pow(1 + monthlyRI, -tenureInMonths));
		System.out.println("Priniciple amount : " + p);
		System.out.println("EMI : " + emi);
		double totalAmount = emi * tenureInMonths;
		System.out.println("Total amount should pay : " + totalAmount);
		System.out.println("Extra amount is paying : " + (totalAmount - p));

		return emiAmt;

	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
