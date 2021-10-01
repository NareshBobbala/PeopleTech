package com.peopletech.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static void main(String args[]){ 
		
		ArrayList<Employee> al=new ArrayList<Employee>();  
		al.add(new Employee(111,"santhosh",25,8000));  
		al.add(new Employee(126,"sai",22,2000));  
		al.add(new Employee(135,"Jai",29,5000));  
		 
		Collections.sort(al); 
		for(Employee st:al){  
		System.out.println(st.id+" "+st.name+" "+st.age+" "+st.salary);  
		}  
		}  
		}  
	
	


