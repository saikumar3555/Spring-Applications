package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.spring.model.User;

@Controller
public class UserController {

	/*
	 * Get user from session attribute
	 */
	@GetMapping("/info")
	public String userInfo(@SessionAttribute("user") User user) {

		System.out.println("Email: " + user.getEmail());
		System.out.println("First Name: " + user.getFname());

		return "user";
	}
}
