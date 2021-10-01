package com.peopletech.set;

import java.util.Objects;

public class Product implements Comparable<Product> {

	 
	private double price ;
	private String name ;
	private int rating;
	
	
	public Product() {
		
	}
	public Product(double price, String name, int rating) {
		super();
		this.price = price;
		this.name = name;
		this.rating = rating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public int compareTo(Product o) {
		
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + ", rating=" + rating + "]";
	}
	
	
}
