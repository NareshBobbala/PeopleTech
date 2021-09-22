package com.peopletech.pattern;
public class StarPattern {
	public static void main(String[] args) {
		int temp=0;
		for(int i=1;i<=9;i++) {
			if(i<=5) {
				temp++;
			}
			else {
				temp--;
				
			}
			
			for(int j=1;j<=temp;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
