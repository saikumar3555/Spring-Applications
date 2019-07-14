package com.mcf.beans;

public class Engine {

	private Integer engId;
	private String fuelType;

	public Integer getEngId() {
		return engId;
	}

	public void setEngId(Integer engId) {
		this.engId = engId;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [engId=" + engId + ", fuelType=" + fuelType + "]";
	}

}
