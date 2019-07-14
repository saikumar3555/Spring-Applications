package com.redirect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.redirect.model.UserModel;

@Controller
public class UserController {

	@RequestMapping("/loginForm")
	public String displayLoginForm(Model model) {
		model.addAttribute("u", new UserModel());
		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute UserModel um, Model model) {
		if (um.getUname().equals("admin") && um.getPwd().equals("admin123")) {
			// Login successfull
			return "redirect:/buildDashboard";
		} else {
			// login failure
			model.addAttribute("u", new UserModel());
			model.addAttribute("errMsg", "Invalid Credentials");
			return "loginForm";
		}
	}

	@RequestMapping("/buildDashboard")
	public String dashboard(Model model) {
		model.addAttribute("msg", "Reports generating...!!");
		return "dashBoard";
	}
}
