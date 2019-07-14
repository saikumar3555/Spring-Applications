package com.ib.beans;

public class SonyPrinter implements IPrinter {

	public SonyPrinter() {
		System.out.println("Sony Printer : Initialized");
	}

	@Override
	public void printReceipt(double amt) {
		System.out.println("Printing.....");
		System.out.println("Balance : " + amt);
	}

}
