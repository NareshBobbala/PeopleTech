package Programs;

import java.util.Scanner;

public class SumMulSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int a =sc.nextInt();
		System.out.println("Enter 2st number :");
		int b =sc.nextInt();
		
		int c =a+b;
		System.out.println("sum of two numbers  " + c);
		 int d =a-b;
		 System.out.println("substraction of two numbers  " + d);
		 int m=a*b;
		System.out.println("multiplication of two numbers  " + m);
		 int n=a/b;
	     System.out.println("divide of two numbers  " + n);
		 int p =a%b;
		System.out.println(" mod of two numbers  " + p);
				 
	}

}
