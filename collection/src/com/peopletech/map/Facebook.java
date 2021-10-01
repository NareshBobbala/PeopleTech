package com.peopletech.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Facebook {

	
	public static void main(String[] args) {
		
		HashMap<User,List<Friends>>  fac=new HashMap<User,List<Friends>>();
		
		
		 User u1 =new User("naresh"," naresh@gmail.com", "7799560058");
		
		 User u2 =new User("santhosh"," santhosh@gmail.com", "7799560058");
		 User u3 =new User("cherry"," cherry@gmail.com", "7799560058");
		 
		 Friends f1= new Friends ("kumar", "kumar@gmail.com","9875123414");
		 Friends f2= new Friends ("ram", "ram@gmail.com","91455123414");
		 Friends f3= new Friends ("charan", "charan@gmail.com","9875123441");
		 
		 List<Friends> frd1=new ArrayList<Friends>();
		 
		frd1.add(f1);
		frd1.add(f2);
		frd1.add(f3);
		
		List<Friends> frd2=new ArrayList<Friends>();
		frd2.add(f1);
		frd2.add(f2);
		List<Friends> frd3=new ArrayList<Friends>();
		
		frd3.add(f1);
		
		fac.put(u1,frd1);
		fac.put(u3, frd3);
		fac.put(u2, frd2);
		
		System.out.println(fac);
}		
}