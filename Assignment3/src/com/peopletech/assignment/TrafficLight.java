package com.peopletech.assignment;
import java.util.Scanner;
public class TrafficLight {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("\n red"+"\n yellow"+"\n green");
		String choice =sc.next();
		
		switch(choice) {
		
		case "red":System.out.println("Stop");break;
		case  "yellow":System.out.println("Ready");break;
		case "green": System.out.println("Go");break;
		default:System.out.println("Invalid choice ");
		}
		
		
	}
	
	
}
