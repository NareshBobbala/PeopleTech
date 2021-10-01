package com.peopletech.set;

import java.util.Objects;

public class Book {

	private int id;
	String name;
	private String author;
	private String publisher;
	private int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
	
		this.setId(id);
		this.name = name;
		this.setAuthor(author);
		this.setPublisher(publisher);
		this.setQuantity(quantity);
	}
	@Override
	public int hashCode() {
		return Objects.hash(getAuthor(), getId(), name, getPublisher(), getQuantity());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(getAuthor(), other.getAuthor()) && getId() == other.getId() && Objects.equals(name, other.name)
				&& Objects.equals(getPublisher(), other.getPublisher()) && getQuantity() == other.getQuantity();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}