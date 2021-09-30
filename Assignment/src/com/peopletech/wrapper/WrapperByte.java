package com.peopletech.wrapper;

public class WrapperByte {

	public static void main(String[] args) {
		
		
		Byte num[] =new Byte[3];
		num[0]=12;
		num[1]=45;
		num[2]=10;
		
	 	short s =num[0].shortValue();
		System.out.println("returns the value of this  Byte as short "+ s);
		int i=num[1].intValue();
		System.out.println("returns the value of this  Byte as int "+i);
		byte b=num[1].byteValue();
		System.out.println("returns the value of this  Byte as byte "+b);
		double d=num[1].doubleValue();
		System.out.println("returns the value of this  Byte as double "+d);
		
		
		
		
	}
	
	
	
	

}
