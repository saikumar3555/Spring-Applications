package com.nit.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.books.beans.UserBean;
import com.nit.books.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService uService;

	@RequestMapping(value = "/login")
	public String loginForm(Model model) {
		UserBean ub = new UserBean();
		model.addAttribute("ub", ub);
		return "loginForm";
	}

	@RequestMapping(value = "/loginUser")
	public String loginCheck(@ModelAttribute UserBean ub, Model model) {
		// validate the credentials
		// call service method
		boolean status = uService.loginCheck(ub);
		if (status) {
			// redirect to dashboard
			//call another method
			return "redirect:appDashBoard";
		} else {
			model.addAttribute("errMsg", "Invalid credentials");
			model.addAttribute("ub", ub);
			return "loginForm";
		}

	}

	@RequestMapping(value = "/register")
	public String registerForm(Model model) {
		UserBean ub = new UserBean();
		model.addAttribute("ub", ub);
		return "registerForm";
	}

	@RequestMapping(value = "/registerUser")
	public String registerUser(@ModelAttribute UserBean ub, Model model) {
		boolean isInserted = uService.insertUser(ub);
		if (isInserted) {
			model.addAttribute("succMsg", "Record inserted..");
		} else {
			model.addAttribute("errMsg", "Failed to insert");
		}
		model.addAttribute("ub", ub);
		return "registerForm";
	}
	
	@RequestMapping(value="appDashBoard")
	public String appDashBoard(Model model){
		//logic to retrieve books details....
		return "dashboard";
	}
}
