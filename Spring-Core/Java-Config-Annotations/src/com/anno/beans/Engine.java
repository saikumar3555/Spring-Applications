package com.anno.beans;

public class Engine {

	private int engId;
	private String fuelType;

	public void setEngId(int engId) {
		this.engId = engId;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [engId=" + engId + ", fuelType=" + fuelType + "]";
	}

}
