package com.peopletech.map;

public class User {
	
	private  String name;
	private String phoneNumber;
	private String Email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public User(String name, String phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		Email = email;
	}
	@Override
	public String toString() {
		return "\n User [name=" + name + ", phoneNumber=" + phoneNumber + ", Email=" + Email + "]";
	}
}
