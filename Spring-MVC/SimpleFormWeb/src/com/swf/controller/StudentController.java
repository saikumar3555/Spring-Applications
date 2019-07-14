package com.swf.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.swf.model.Student;

@Controller
public class StudentController {

	@RequestMapping
	public String initForm(Model model) {
		Student s = new Student();
		model.addAttribute("s", s);
		return "studentForm";
	}

	@RequestMapping(value = "/addStudent.htm", method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute Student s, Model model) {
		model.addAttribute("sid", s.getSid());
		model.addAttribute("sname", s.getSname());
		model.addAttribute("semail", s.getSemail());
		model.addAttribute("sgender", s.getSgender());
		model.addAttribute("courses", Arrays.toString(s.getCourses()));
		return "studentData";
	}
}
