package com.ba.beans;

public class PersonInfo {
	
	private String name;
	private String email;
	private Long phno;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", email=" + email + ", phno=" + phno + "]";
	}

}
