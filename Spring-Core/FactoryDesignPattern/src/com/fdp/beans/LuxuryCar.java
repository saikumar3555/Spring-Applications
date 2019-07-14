package com.fdp.beans;

public class LuxuryCar implements ICar {

	@Override
	public void manfacture() {
		System.out.println("LuxuryCar Manfacturing Started..!!");
	}

	@Override
	public void assembleParts() {
		System.out.println("LuxuryCar Assembling in progress..!!");

	}

	@Override
	public void test() {
		System.out.println("LuxuryCar is ready for test drive..!!");
	}

}
