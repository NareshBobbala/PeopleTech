package com.peopletech.application;

public class AgeException extends Exception {

	int age;

	public AgeException(int age) {
	
		this.age = age;
	}

	
	public String toString() {
		return "your age must have above 18 years";
	}
	
}
