package com.mcf.beans;

public class Car {

	private Integer id;
	private String name;
	private Engine eng;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", eng=" + eng + "]";
	}

}
