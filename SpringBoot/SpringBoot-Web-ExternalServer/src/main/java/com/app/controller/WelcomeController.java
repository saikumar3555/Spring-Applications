package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public String msg(Model model) {
		model.addAttribute("msg", "This message is from WelcomeController");
		return "welcome";
	}
}
