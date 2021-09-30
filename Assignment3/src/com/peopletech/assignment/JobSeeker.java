package com.peopletech.assignment;
import java.util.Scanner;
public class JobSeeker {
	public static boolean validateChar( int count) {
		
		if(count>=8)
		{
			
			return  true;
		}
		else 
			
			return false;
	}
	
	public static void main(String[] args) {
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String userName=sc.next();
	    String job="_job";
		 String jobApp=userName+job;
		 System.out.println("Applicant name "+jobApp);
		 
		 for(int i=0;i<userName.length();i++) {
			 
			if(userName.charAt(i)!=' ') {
				
				
				count++;
			} 
		 }
		
		 
		 System.out.println( validateChar(count));
		
	}

}
