package com.peopletech.assignment;
import java.util.Arrays;
public class LowerUpper {

	public static void main(String[] args) {
		
		String str[] = {"naresh","kumar","sai","santhosh","vamshi"};
		
		Arrays.sort(str);
		System.out.println("sorted array ");
		for(int i=0;i<str.length;i++) {
			
			System.out.println(str[i]);
		}
		int mid=(str.length)/2;
		
		System.out.println("result array");
		for(int i=0;i<=mid;i++) {
			
	
			System.out.println(str[i].toUpperCase());
		}
		for(int i=mid+1;i<str.length;i++)
		{
			
			System.out.println(str[i].toLowerCase());
		}
	}

}
