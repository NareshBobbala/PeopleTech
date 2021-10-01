package com.peopletech.set;

import java.util.Objects;

public class Movie implements Comparable<Movie>{


	
	 private int id;
	 private int  price;
	 private double duration;
	 private String title;

	
	public Movie(int id, int price, double duration, String title) {
		super();
		this.id = id;
		this.price = price;
		this.duration = duration;
		this.title = title;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", price=" + price + ", duration=" + duration + ", title=" + title + "]";
	}

	@Override
	public int compareTo(Movie m) {
		
		return this.title.compareTo(m.title);
	}
	
}
