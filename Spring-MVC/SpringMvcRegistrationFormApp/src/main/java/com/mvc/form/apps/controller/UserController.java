package com.mvc.form.apps.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.form.apps.model.User;
import com.mvc.form.apps.service.UserService;

@Controller
public class UserController {

	@Autowired(required = true)
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String regForm(Model model) {
		model.addAttribute("user", new User());
		initparams(model);
		return "register";
	}

	@RequestMapping(value = "/regUser", method = RequestMethod.POST)
	public String register(Model model, @Valid @ModelAttribute("user") User u, BindingResult result) {
		System.out.println(u);

		if (result.hasErrors()) {
			initparams(model);
			return "register";
		}

		//Business logic to insert record in DB
		
		model.addAttribute("msg", "Registration Successfull..!!");
		return "success";
	}

	public void initparams(Model model) {
		model.addAttribute("genders", userService.getGenders());
		model.addAttribute("timings", userService.getTimings());
		model.addAttribute("courses", userService.getCourses());
	}

}
