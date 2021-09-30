package com.peopletech.assignment;
import java.util.Scanner;
public class Incresing {
public static void main(String[] args) {
		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
	}
	public static boolean checkNumber(int n) {
		
		while(n > 0) {
			int ft = n % 10;
			n = n/10;
			int st = n % 10;
			if (ft < st) {
				return false;
			}
		}
		
		return true;
	}

}


