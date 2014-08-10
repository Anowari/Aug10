package com.infix.test;

public class SumAndAverage {

	public static void main(String[] args) {
		int sum=0;
	      double average;       
	      int lowerbound = 1;   
	      int upperbound = 100; 
	      for (int number = lowerbound; number <= upperbound; ++number){
	          sum += number;
	      }
	       //System.out.println(sum);
	          float avg = sum/100;
	          System.out.println(avg);
	        		  
	}

	
}