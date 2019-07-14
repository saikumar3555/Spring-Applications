package com.nb.beans;

public class Fuel {

	private String fuelType;

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Fuel [fuelType=" + fuelType + "]";
	}

}
