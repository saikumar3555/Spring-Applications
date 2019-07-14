package com.fdp.beans;

public class CarFactory {

	public static ICar createCar(String type) {
		ICar car = null;
		if (type.equals("normal")) {
			car = new NormalCar();
		} else if (type.equals("luxury")) {
			car = new LuxuryCar();
		}
		return car;
	}

}
