package com.event.beans;

import org.springframework.context.ApplicationEvent;

public class LogEvent extends ApplicationEvent {

	private String msg;

	public LogEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

}
