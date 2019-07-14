package com.ci.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private String name;
	private List<String> visitedPlaces;
	private Set<String> courses;
	private Map<String, Long> mobileNums;
	private Properties emails;

	public void setName(String name) {
		this.name = name;
	}

	public void setVisitedPlaces(List<String> visitedPlaces) {
		this.visitedPlaces = visitedPlaces;
	}

	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}

	public void setMobileNums(Map<String, Long> mobileNums) {
		this.mobileNums = mobileNums;
	}

	public void setEmails(Properties emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", visitedPlaces=" + visitedPlaces + ", courses=" + courses + ", mobileNums="
				+ mobileNums + ", emails=" + emails + "]";
	}

}
