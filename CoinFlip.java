package com.assignments.day5.PracticeProblem;

import java.util.*;

public class CoinFlip {
  public static void main(String[] args) {
    System.out.println("Enter the number of times to Flip Coin:");
	Scanner S = new Scanner(System.in);
    double n = S.nextInt();
    //Counters
    int head = 0;
    int tail = 0;

    if(n<0) {
    	System.out.println("Enter a positive integer.");
    }
    else {
    	for(int i=1;i<=n;i++) {
    		int toss;
    		Random ran = new Random();
    		toss = ran.nextInt(2);
    	
    		if(toss == 1) {
    			head++ ;   //headCounter
    		}
    		else
    			tail++ ;  //tailCounter
    		}
    System.out.println("Number of Toss results Head: "+head);	
    System.out.println("Number of Toss results Tail: "+tail);
    }
    //PercentageCalculation
    double headpercent = ((head/n)*100);
    double tailpercent = ((tail/n)*100);
    System.out.println("\nPercentage of Head vs Tail:");
    System.out.println((int)Math.floor(headpercent)+"% : "+(int)Math.floor(tailpercent)+"%");
    
  }
}
