package com.fdp.beans;

public class OrderCar {

	public void placeOrder(String type) {
		ICar car = CarFactory.createCar(type);
		car.manfacture();
		car.assembleParts();
		car.test();
		System.out.println("Payment is in progress");
		System.out.println("Payment is sucessfull");

	}

}
