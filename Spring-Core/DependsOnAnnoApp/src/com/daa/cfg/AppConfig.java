package com.daa.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.daa.beans.A;
import com.daa.beans.B;

@Configuration
public class AppConfig {

	@Bean("a")
	@DependsOn("b")
	public A createA() {
		return new A();
	}

	@Bean("b")
	@Lazy
	public B createB() {
		return new B();
	}
}
