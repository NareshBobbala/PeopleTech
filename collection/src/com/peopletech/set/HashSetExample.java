package com.peopletech.set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Book> set=new HashSet<Book>();
		
		Book b1=new Book(101,"C","Yashwant kanetkar","BPB",8);
		Book b2=new Book(102,"Data communication","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galyin","wiley",6);
		Book b4=new Book(104," System and signals","Smith","steave",2);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);

		for(Book b:set) {
		System.out.println(b.getId()+" "+b.name+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuantity());
		}
		}
		}