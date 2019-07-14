package com.aw.beans;

public class Engine {

	private Integer id;
	private String fuelType;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", fuelType=" + fuelType + "]";
	}

}
