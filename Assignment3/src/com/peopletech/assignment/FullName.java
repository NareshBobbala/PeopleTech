package com.peopletech.assignment;
import java.util.Scanner;
public class FullName {
	public static void completeName (String firstName, String lastName) throws NameException {
        
		
		if (firstName.isEmpty() || lastName.isEmpty()){
        	
        	 throw new NameException();
        	 
                   }
        else{
        	
        	System.out.println("Your name is :"+firstName+" "+lastName);
        }
    }
   
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);  
       
        try{
            String firstName = "Naresh";
            String lastName = "b";
            completeName(firstName, lastName);
        }
        catch(NameException e){
            System.out.println(e.toString());
        }
       
       
       
    }
   
    
}