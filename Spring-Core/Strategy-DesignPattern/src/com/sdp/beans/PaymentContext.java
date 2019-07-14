package com.sdp.beans;

public class PaymentContext {
	public PaymentContext() {
		System.out.println("PaymentContext:Constructor called..");
	}

	private IPayment payment = null;

	public PaymentContext(IPayment payment) {
		System.out.println("PaymentContext: Param-Constructor");
		this.payment = payment;
	}

	public void payBill(double amount) throws Exception {
		if (payment == null) {
			throw new Exception("Option is not available");
		}
		boolean status = payment.pay(amount);
		if (status == true) {
			System.out.println("Payment is sucessfull...!");
			System.out.println("Thankyou.. Visit Again..!!");
		} else {
			System.out.println("Payment declined..!");
		}
	}

	/**
	 * This method is used to set dependent object to call pay() method
	 * 
	 * @param payment
	 */

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

}
