package com.suhm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.suhm.service.GreetService;

public class GreetController extends AbstractController {

	public GreetController() {
		System.out.println("*****GreetController:::Constructor*****");
	}

	private GreetService greetService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mav = new ModelAndView();

		// Setting view file name
		mav.setViewName("greetMsg");

		String greetMsg = greetService.generateGreetMsg();

		mav.addObject("msg", greetMsg);

		return mav;
	}

	public void setGreetService(GreetService greetService) {
		this.greetService = greetService;
	}

}
