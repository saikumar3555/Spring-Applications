package com.bi.beans;

public class Mobile {

	private Integer id;
	private String name;
	private String color;
	private Double price;
	private String imei;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", imei=" + imei + "]";
	}

}
