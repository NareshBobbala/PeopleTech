package com.peopletech.assignment;
import java.time.*;
import java.util.*;
public class Date {
public static void main(String[] args)
{
LocalDate Date = LocalDate.of(1999,1,06);
System.out.println("Old date :"+Date);
LocalDate now = LocalDate.now();
System.out.println("Current Date :"+now);
Period different = Period.between(Date, now);
System.out.println("Printing the difference is :"+different);

}

} 