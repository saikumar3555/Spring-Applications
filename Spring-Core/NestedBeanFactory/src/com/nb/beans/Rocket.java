package com.nb.beans;

public class Rocket {

	private String id;
	private String name;
	private Fuel fuel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Rocket [id=" + id + ", name=" + name + ", fuel=" + fuel + "]";
	}

}
