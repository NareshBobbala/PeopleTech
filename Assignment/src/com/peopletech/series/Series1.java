package com.peopletech.series;
import java.util.Scanner;
public class Series1 {
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a =sc.nextInt();
		int n=1,count=0;
		for(int i=1;i<=a;i++) {
			
			System.out.print(n+" ");
			if(i%2!=0) {
				count+=8;
			}
			int temp=n+count;
			n=temp;
		}

	}

}
