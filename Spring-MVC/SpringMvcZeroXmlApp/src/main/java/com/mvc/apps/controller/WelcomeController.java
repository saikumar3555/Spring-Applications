package com.mvc.apps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String greet(Model model){
		model.addAttribute("msg", "Welcome to Spring MVC..!!");
		return "welcome";
	}

}
