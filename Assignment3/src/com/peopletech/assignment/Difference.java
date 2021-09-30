package com.peopletech.assignment;
public class Difference {
	public static int calculateDifference(int n) {
		int squareOfSum=0,sumofSquare=0 ;
		
		for(int i=1;i<=n;i++) {
			sumofSquare+=(i*i);
			squareOfSum+=i;	
		}
		System.out.println("sum of squares "+sumofSquare);
		System.out.println("squares of sum "+(squareOfSum*squareOfSum));
		int diff=(squareOfSum*squareOfSum)-(sumofSquare);
		
		return diff;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("The difference is "+calculateDifference(10));
	}

}
