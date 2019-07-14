package com.suhm.service;

import java.util.Calendar;

public class GreetService {

	public GreetService() {
		System.out.println("**** GreetService:::Constructor ****");
	}

	public String generateGreetMsg() {
		String msg = null;
		// Business logic goes here
		Calendar c = Calendar.getInstance();

		// It gives hour in 24 hours format
		int hour = c.get(Calendar.HOUR_OF_DAY);

		if (hour >= 6 && hour < 12) {
			msg = "Good Morning..!!";
		} else if (hour >= 12 && hour <= 19) {
			msg = "Good Evening..!!";
		} else {
			msg = "Good Night..!";
		}
		return msg;
	}

}
