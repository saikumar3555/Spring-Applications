package com.mvc.form.apps.model;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class User {

	@NotEmpty(message = "Please enter username")
	private String uname;
	
	@NotEmpty(message="Please enter email")
	@Email(message="Please enter valid email")
	private String email;
	
	@NotEmpty(message="Please enter password")
	private String pwd;
	
	@NotEmpty(message="Please select gender")
	private String gender;
	
	@NotEmpty(message="Please select timings")
	private List<String> timings;
	
	@NotEmpty(message="Please select courses")
	private List<String> courses;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getTimings() {
		return timings;
	}

	public void setTimings(List<String> timings) {
		this.timings = timings;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", email=" + email + ", pwd=" + pwd + ", gender=" + gender + ", timings="
				+ timings + ", courses=" + courses + "]";
	}

}
