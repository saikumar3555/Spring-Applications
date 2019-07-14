package com.anno.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

public class Car {

	private int id;
	private String name;
	private Engine eng;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Inject
	@Named("eng1")
	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@PostConstruct
	public void start() {
		System.out.println("Car started...");
	}

	@PreDestroy
	public void stop() {
		System.out.println("Car stopped...");
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", eng=" + eng + "]";
	}

}
