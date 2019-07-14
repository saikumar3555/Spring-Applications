package com.beans;

public class Car {

	public Car() {
		System.out.println("Car:constructor");
	}
	
	
	private Integer cid;
	private String name;
	private String color;

	private Engine eng;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", name=" + name + ", color=" + color + ", eng=" + eng + "]";
	}

}
