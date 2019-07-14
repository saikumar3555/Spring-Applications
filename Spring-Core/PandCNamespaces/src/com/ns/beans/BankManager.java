package com.ns.beans;

public class BankManager {

	private String managerName;
	private String managerExp;
	private String email;

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public void setManagerExp(String managerExp) {
		this.managerExp = managerExp;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "BankManager [managerName=" + managerName + ", managerExp=" + managerExp + ", email=" + email + "]";
	}

}
