package com.peopletech.assignment;
import java.util.Arrays;
public class LowerUpper2 {

	public static void main(String[] args) {
		
		String str[] = {"naresh","kumar","sai","santhosh","vamshi"};
		
		Arrays.sort(str);
		System.out.println("sorted array ");
		for(int i=0;i<str.length;i++) {
			
			System.out.print(str[i]+" ");
		}
		int mid=(str.length)/2;
		
		System.out.println("\n result array");
		for(int i=0;i<=mid;i++) {
			
	
			System.out.print(str[i].toUpperCase()+" ");
		}
		for(int i=mid+1;i<str.length;i++)
		{
			
			System.out.print(str[i].toLowerCase()+" ");
		}
	}

}
