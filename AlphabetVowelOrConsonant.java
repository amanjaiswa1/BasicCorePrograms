package com.assignments.day5.PracticeProblem;

import java.util.Scanner;

public class AlphabetVowelOrConsonant {
	public static void main(String[] args) {
		System.out.println("Enter an Alphabet to check if it is Vowel OR Consonant ::");
		Scanner sc = new Scanner(System.in);
		char c;
		c=sc.next().charAt(0);
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			System.out.println(c+" is a Vowel.");
		}
		else
			System.out.println(c+" is a Consonant.");	
	}
}
