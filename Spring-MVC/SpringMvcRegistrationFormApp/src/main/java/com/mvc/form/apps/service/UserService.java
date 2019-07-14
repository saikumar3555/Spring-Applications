package com.mvc.form.apps.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

	public List<String> getGenders() {
		List<String> genders = new ArrayList();
		genders.add("Male");
		genders.add("Fe-Male");
		return genders;
	}

	public List<String> getCourses() {
		List<String> courses = new ArrayList();
		courses.add("Spring");
		courses.add("Hibernate");
		courses.add("RESTful Services");
		return courses;
	}

	public List<String> getTimings() {
		List<String> timings = new ArrayList();
		timings.add("Morning");
		timings.add("Afternoon");
		timings.add("Evening");
		return timings;
	}

}
