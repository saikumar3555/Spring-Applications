package com.ba.beans;

public class OrderInfo {

	private String orderId;
	private String itemNames;
	private Double price;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setItemNames(String itemNames) {
		this.itemNames = itemNames;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", itemNames=" + itemNames + ", price=" + price + "]";
	}

}
