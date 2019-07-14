package com.ib.beans;

public class HPPrinter implements IPrinter {

	public HPPrinter() {
		System.out.println("HPPrinter:initialized..");
	}

	@Override
	public void printReceipt(double amt) {
		System.out.println("Printing.....");
		System.out.println("Balance : " + amt);
	}

}
