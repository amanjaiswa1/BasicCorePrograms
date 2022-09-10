package com.assignments.day5.PracticeProblem;

import java.util.Scanner;

public class HarmonicSeries {
	public static void main(String[] args) {
		System.out.println("Enter the Nth Harnomic Number \nTo print the series of form 1/1 + 1/2 + .... +1/n ::");
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		double series=0;
		
		if(n!=0) {
			for(int i=1; i<=n; i++) {
				double harmonic= (1.0/i);
				System.out.printf("1/"+i+" = "+"%.2f",harmonic);
				System.out.println("");
				series = series+harmonic;
			}
			System.out.printf("Sum of the Harmonic Series is: %.2f ",series);
		}
		else
			System.out.println("N cannot be zero.");
		
	}
}
