package com.bl.beans;

public class Motor {

	private Integer id;
	private String name;

	public void start() throws Exception {
		System.out.println("Motor is starting...!!");
	}

	public void doWork() {
		System.out.println("Motor is running...!!");
	}

	public void stop() {
		System.out.println("Motor is stopping..!!");
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
