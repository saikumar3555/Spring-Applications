package com.ba.beans;

public class DTDCDeliverService implements IDelivery {

	@Override
	public void deliver(PersonInfo pinfo, OrderInfo oinfo, AddressInfo ainfo) {
		// logic
		System.out.println("Delivery handed over to DTDC..!!");
		System.out.println("Order got Delivered..!!");
	}

}
