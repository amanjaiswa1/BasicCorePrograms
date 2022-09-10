package com.assignments.day5.PracticeProblem;

import java.util.*;

public class LeapYear {
	public static void main(String[] args) {
	 int year;
     System.out.println("Enter a Year to check if it is Leap Year or not:");
     Scanner S = new Scanner(System.in);
     year = S.nextInt();
     if(year>999) {
    	 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
    		 System.out.println(year+" is a leap year.");
    	 else
    		 System.out.println(year+" is not a leap year.");
     	}
     else
    	 System.out.println("Please enter a four digit number.");
	}
}