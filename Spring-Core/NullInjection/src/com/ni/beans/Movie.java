package com.ni.beans;

public class Movie {

	private Integer id;
	private String name;
	private String director;
	private String producer;

	public Movie(Integer id, String name, String director, String producer) {
		this.id = id;
		this.name = name;
		this.director = director;
		this.producer = producer;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", director=" + director + ", producer=" + producer + "]";
	}

}
