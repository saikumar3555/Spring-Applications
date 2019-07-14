package com.beans;

public class Engine {

	public Engine() {
		System.out.println("Engine : Constructor");
	}

	private Integer id;
	private String fuelType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", fuelType=" + fuelType + "]";
	}

}
