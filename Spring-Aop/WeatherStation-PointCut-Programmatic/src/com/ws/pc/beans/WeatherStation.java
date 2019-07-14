package com.ws.pc.beans;

public class WeatherStation {

	public double getTemperature(Integer zipcode) {
		System.out.println("Identifying Temperature...");
		return 45.56;
	}

	public boolean willItReainToday(int zipcode) {
		System.out.println("Checking Clouds...");
		return false;
	}

	public boolean willItReainTomorrow(int zipcode) {
		System.out.println("Checking Clouds...");
		return false;
	}

}
