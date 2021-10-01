package com.peopletech.map;

import java.util.HashMap;

public class SampleMapDemo {

	
	public static void main(String[] args) {
		
		HashMap<Integer,Member> members =new HashMap<Integer,Member>();
		
		members.put(123,new Member("naresh","naresh@gmail.com","7799560058"));
		members.put(131,new Member("sai","sai@gmail.com","9582613004"));
		members.put(123,new Member("kumar","kumar@gmail.com","7799560258"));
		
		System.out.println(members);
	}
}
class Member{
	private String name;
	private String email;
	private String mobile ;

	public Member(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "  Member [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
	
}