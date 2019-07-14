package com.sp.apps;

public class Car {

	private IEngine eng = null;

	public void setEng(IEngine eng) {
		this.eng = eng;
	}

//	public Car(IEngine eng) {
//		this.eng = eng;
//	}

	public void drive() throws Exception {
		if (eng == null) {
			throw new Exception("No Engine available to drive..");
		}
		int status = eng.start();
		if (status == 0) {
			System.out.println("Engine started... Happy journey...!!");
		} else if (status == 1) {
			System.out.println("Fuel Outage..");
		} else if (status == 2) {
			System.out.println("Restart the engine..");
		} else if (status == -1) {
			System.out.println("Contact Mechaninc");
		}
	}
}
