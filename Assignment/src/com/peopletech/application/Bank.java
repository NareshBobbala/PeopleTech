package com.peopletech.application;

public class Bank {
 public void account(String name,int age) throws AgeException {
	 
	 if(age<18)
		 
		 throw new AgeException(age);
	 else
		 System.out.println("account succesfully created ");
	 
 }
	public static void main(String[] args) {
		

			Bank age= new Bank();
			
			try  
			{
				
				age.account("naresh", 23);
				age.account("kumar",17);
			}
			catch(AgeException e) {
				System.out.println(e);
			}
				
	}

}
