package com.validation.model;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@Size(max = 20, min = 3, message = "{user.name.empty}")
	private String name;

	@Email(message = "{user.email.invalid}")
	private String email;

	@NotEmpty(message = "{user.gender.empty}")
	private String gender;

	@NotEmpty(message = "{user.languages.empty}")
	private List<String> languages;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", gender=" + gender + ", languages=" + languages + "]";
	}

}
