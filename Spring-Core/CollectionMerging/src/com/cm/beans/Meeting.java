package com.cm.beans;

import java.util.List;

public class Meeting {

	private String name;
	private List<String> participants;

	public void setName(String name) {
		this.name = name;
	}

	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}

	@Override
	public String toString() {
		return "Meeting [name=" + name + ", participants=" + participants + "]";
	}

}
