package com.ba.beans;

public class OrderManager {

	private IDelivery deliveryServ1;
	private IDelivery deliveryServ2;
	private PersonInfo pinfo;
	private OrderInfo oinfo;
	private AddressInfo ainfo;

	public void processOrder() {
		if (ainfo != null) {
			long zipCode = ainfo.getZip();
			if (zipCode >= 5000) {
				deliveryServ1.deliver(pinfo, oinfo, ainfo);
			} else {
				deliveryServ2.deliver(pinfo, oinfo, ainfo);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	public IDelivery getDeliveryServ1() {
		return deliveryServ1;
	}

	public void setDeliveryServ1(IDelivery deliveryServ1) {
		this.deliveryServ1 = deliveryServ1;
	}

	public IDelivery getDeliveryServ2() {
		return deliveryServ2;
	}

	public void setDeliveryServ2(IDelivery deliveryServ2) {
		this.deliveryServ2 = deliveryServ2;
	}

	public PersonInfo getPinfo() {
		return pinfo;
	}

	public void setPinfo(PersonInfo pinfo) {
		this.pinfo = pinfo;
	}

	public OrderInfo getOinfo() {
		return oinfo;
	}

	public void setOinfo(OrderInfo oinfo) {
		this.oinfo = oinfo;
	}

	public AddressInfo getAinfo() {
		return ainfo;
	}

	public void setAinfo(AddressInfo ainfo) {
		this.ainfo = ainfo;
	}

}
