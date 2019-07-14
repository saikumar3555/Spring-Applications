package com.mvc.apps.service;

import org.springframework.stereotype.Service;

@Service(value = "appService")
public class AppService {

	public AppService() {
		System.out.println("**** AppService ::: Controller ****");
	}

	public String homeMsg() {
		return "Welcome to my project..!!";
	}

	public String dashboardMsg() {
		return "Dashboard page under construction..!!";
	}

}
