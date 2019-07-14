package com.sdp.beans;

public class DebitCardPayment implements IPayment {
	@Override
	public boolean pay(double amt) {
		System.out.println("Paying through Debitcard..");
		// logic
		return false;
	}
}
