package com.interceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("msg", "Welcome to My Project...!!");
		return "index";
	}

	@RequestMapping("/wish")
	public String wish(Model model) {
		model.addAttribute("msg", "Good Morning...!!");
		for (int i = 0; i <= 100; i++) {
			// TODO:
		}
		return "index";
	}
}
