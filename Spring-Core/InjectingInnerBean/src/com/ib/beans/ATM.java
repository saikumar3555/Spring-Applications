package com.ib.beans;

public class ATM {

	private IPrinter printer;

	public void checkBal(int pin) {
		// logic to check bal-Webservice
		printer.printReceipt(4500.78);
	}

	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}

}
