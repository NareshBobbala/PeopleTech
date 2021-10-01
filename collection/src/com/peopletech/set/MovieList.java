package com.peopletech.set;

import java.util.Scanner;
import java.util.TreeSet;

public class MovieList {
	
	
	public static void main(String[] args) {
		
		TreeSet<Movie> prods=null;    
	       
        Scanner sc=new Scanner(System.in);
        System.out.println("How would you like to Sort movie");
        String sort=sc.next();
       
        if(sort.equalsIgnoreCase("id"))
            prods=new TreeSet<Movie>(new MovieById());
       
        else if(sort.equalsIgnoreCase("price"))
            prods=new TreeSet<Movie>(new MovieByPrice());
        else if(sort.equalsIgnoreCase("title"))
            prods=new TreeSet<Movie>();
        else if(sort.equalsIgnoreCase("duration"))
            prods=new TreeSet<Movie>(new MovieByDuration());
        
	        prods.add(new Movie(12,150,2.5,"shershaa"));
	        prods.add(new Movie(10,250,1.5,"rebal"));
	        prods.add(new Movie(15,300,2.0,"bahubali"));
	        prods.add(new Movie(20,400,3.5,"veramallu"));
	       
	        System.out.println(prods);
	       
	       

}
}
