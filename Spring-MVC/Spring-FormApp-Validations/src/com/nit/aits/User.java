package com.nit.aits;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@NotEmpty(message = "Please Enter Username")
	@Size(min = 3, max = 5,message="Username should be with in 3 to 5 charachters")
	private String username;
	@NotEmpty(message = "Please Enter Password")
	private String password;
	@NotEmpty(message = "Please Enter Email-Id")
	@Email(message = "Please Enter Valid Email-Id")
	private String email;
	private Long mobileNo;
	@NotEmpty(message = "Please Select Gender")
	private String gender;
	@NotEmpty(message = "Please Select Course(s)")
	private List<String> intrestedCourses;
	@NotEmpty(message = "Please Select Timings")
	private List<String> preferrableTimings;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getIntrestedCourses() {
		return intrestedCourses;
	}

	public void setIntrestedCourses(List<String> intrestedCourses) {
		this.intrestedCourses = intrestedCourses;
	}

	public List<String> getPreferrableTimings() {
		return preferrableTimings;
	}

	public void setPreferrableTimings(List<String> preferrableTimings) {
		this.preferrableTimings = preferrableTimings;
	}

}
