package com.sp.test;

import com.sp.apps.Car;
import com.sp.apps.Engine2;

public class TestCar {

	public static void main(String[] args) throws Exception {
		Car c = new Car();
		c.setEng(new Engine2());
		c.drive();
	}
}
