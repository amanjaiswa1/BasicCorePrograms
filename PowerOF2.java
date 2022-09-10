package com.assignments.day5.PracticeProblem;

import java.util.*;

public class PowerOF2 {
	public static void main(String[] args) {
		System.out.println("Enter a number to get result till 2^n:");
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		if(n<31) {
			for(int i=0;i<=n;i++) {
				int power = (int) Math.pow(2,i);
				System.out.println("2^"+i+" = "+power);
			}
		}
		else
			System.out.println("Please enter the value less than 31 because 2^31 overflows an int.");

	}
}