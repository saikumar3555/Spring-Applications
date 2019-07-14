package com.sweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sweb.service.MsgService;

@Controller
public class WishController {

	@Autowired(required = true)
	private MsgService msgService;

	@RequestMapping("/wish.htm")
	public String generateWishMsg(Model model) {
		model.addAttribute("msg", msgService.generateMsg());
		return "index";
	}

	@RequestMapping("/greet.htm")
	public String wish(Model model) {
		model.addAttribute("msg", msgService.generateMsg());
		return "index";
	}

}
