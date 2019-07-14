package com.ba.beans;

public class Robot {

	private int id;
	private String name;
	private String type;

	private Chip c;

	public Robot(Chip c) {
		this.c = c;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setC(Chip c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", type=" + type + ", c=" + c + "]";
	}

}
