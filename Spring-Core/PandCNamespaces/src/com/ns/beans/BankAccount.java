package com.ns.beans;

public class BankAccount {

	private Long accNo;
	private String holderName;
	private String accType;
	private String ifscCode;
	private String branchLocation;
	private BankManager manager;

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public void setManager(BankManager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", holderName=" + holderName + ", accType=" + accType + ", ifscCode="
				+ ifscCode + ", branchLocation=" + branchLocation + ", manager=" + manager + "]";
	}

}
