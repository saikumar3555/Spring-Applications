package com.sdp.beans;

public class AmexCardPayment implements IPayment {
	@Override
	public boolean pay(double amt) {
		System.out.println("Paying through Amexcard..");
		// logic
		return true;
	}
}
