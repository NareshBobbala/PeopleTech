package com.peopletech.wrapper;

public class WrapperArray {

	public static void main(String[] args) {
		
		Integer ids[] =new Integer[4];
		ids[0]=129;
		ids[1]=23;
		ids[2]=150;
		int i=ids[2];
		System.out.println("int value is  :"+i);
		byte b= ids[0].byteValue();
		double d =ids[2].doubleValue();
		float f=ids[0].floatValue();
		long l=ids[0].longValue();
		System.out.println("byte is  :"+b);
		System.out.println("double value is  :"+d);
		System.out.println("float value is  :"+f);
		System.out.println("long value is  :"+l);
 	}

}
