package com.mvc.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.apps.service.AppService;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("**** HomeController::: Constructor ****");
	}

	@Autowired(required = true)
	public AppService appService;

	@RequestMapping(value = "/home.htm")
	public String homeDisplay(Model model) {
		model.addAttribute("msg", appService.homeMsg());
		return "home";
	}

	@RequestMapping(value = "/dashboard.htm")
	public String dashboardDisplay(Model model) {
		model.addAttribute("msg", appService.dashboardMsg());
		return "dashboard";
	}

}
