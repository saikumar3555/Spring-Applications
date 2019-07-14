package com.ba.beans;

public class BlueDartDeliverService implements IDelivery {

	@Override
	public void deliver(PersonInfo pinfo, OrderInfo oinfo, AddressInfo ainfo) {
		// logic
		System.out.println("Delivery handed over to BlueDart..!!");
		System.out.println("Order got Delivered..!!");
	}

}
