package com.cg.eis.Exception;
import java.util.Scanner;
public class EmployeeException {
	
 public void checkAmount(int salary) throws  SalaryException {
	 
		if(salary>3000) {
			
			System.out.println("your salary is above 3000 ");
			
		}
		else
			throw new  SalaryException();
		
	}
	public static void main(String[] args) {
		
		EmployeeException amount =new EmployeeException();
		
		try {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your salary");
			int n=sc.nextInt();
			amount.checkAmount(n);
			
		}
		catch(SalaryException e)
		{
		System.out.println(e);

	}

}	
}
