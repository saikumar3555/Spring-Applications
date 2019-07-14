package com.bfpp.beans;

public class ConnectionProvider {

	private String url;
	private String uname;
	private String pwd;
	private String driverCls;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setDriverCls(String driverCls) {
		this.driverCls = driverCls;
	}

	@Override
	public String toString() {
		return "ConnectionProvider [url=" + url + ", uname=" + uname + ", pwd=" + pwd + ", driverCls=" + driverCls
				+ "]";
	}

}
