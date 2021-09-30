package com.peopletech.assignment;
import java.util.Scanner;
public class PowerOf2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
	}
	public static boolean checkNumber(int n) {
		while(n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n = n/2;
		}
		return true;
	}

}


