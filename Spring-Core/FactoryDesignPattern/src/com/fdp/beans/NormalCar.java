package com.fdp.beans;

public class NormalCar implements ICar {

	@Override
	public void manfacture() {
		System.out.println("NormalCar Manfacturing Started..!!");
	}

	@Override
	public void assembleParts() {
		System.out.println("NormalCar Assembling in progress..!!");

	}

	@Override
	public void test() {
		System.out.println("NormalCar is ready for test drive..!!");
	}

}
