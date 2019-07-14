package com.nit.aits;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String viewRegistration(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		initializeParameters(model);
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegistration(@Valid @ModelAttribute User user,
			BindingResult result, Model model) {
		initializeParameters(model);
		if (result.hasErrors()) {
			return "register";
		} else {
			model.addAttribute("user", user);
			return "success";
		}
	}

	private void initializeParameters(Model model) {
		List<String> courseList = new ArrayList();
		courseList.add("Java");
		courseList.add("J2EE");
		courseList.add("Spring");
		courseList.add("Hibernate");
		courseList.add("Jquery");
		model.addAttribute("courses", courseList);

		List<String> gendersList = new ArrayList();
		gendersList.add("Male");
		gendersList.add("Female");
		model.addAttribute("genders", gendersList);

		List<String> timingsList = new ArrayList();
		timingsList.add("Morning");
		timingsList.add("Afternoon");
		timingsList.add("Evening");
		model.addAttribute("timings", timingsList);
	}
}
