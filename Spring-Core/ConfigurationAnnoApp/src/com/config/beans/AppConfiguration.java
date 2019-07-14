package com.config.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfiguration {

	@Bean
	@Scope(value="prototype")
	public Car getCar() {
		return new Car();
	}
	
}
