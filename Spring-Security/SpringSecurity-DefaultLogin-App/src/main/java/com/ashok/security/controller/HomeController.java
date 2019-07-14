package com.ashok.security.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		return "home";
	}

	@RequestMapping("/welcome")
	public String welcome(Model model, Principal principle) {
		String uname = principle.getName();
		model.addAttribute("name", uname);
		model.addAttribute("message", "Spring Security Form");
		return "welcome";
	}

	@RequestMapping("/logout")
	public String logout(Model model) {
		return "home";
	}

}
