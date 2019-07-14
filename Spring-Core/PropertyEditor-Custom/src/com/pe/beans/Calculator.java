package com.pe.beans;

public class Calculator {

	private AddNumber an;

	public void addNumbers() {
		int result = an.sum();
		System.out.println("Result : " + result);
	}

	public void setAn(AddNumber an) {
		this.an = an;
	}

}
