package com.peopletech.set;
import java.util.*;  
import java.io.*;  
public class Employee implements Comparable<Employee> {
	
	
	int id;
    String name;
    int age;
    int salary;

    public Employee(int id, String name, int age, int salary) {
    	super();
    	this.id = id;
    	this.name = name;
    	this.age = age;
    	this.salary = salary;
}
    public int compareTo(Employee st){  
    	if(id==st.id)  
    		return 0;  
    	else if(id>st.id)  
    		return 1;  
    	else  
    		return -1;  
}  
}  
	
	
	

