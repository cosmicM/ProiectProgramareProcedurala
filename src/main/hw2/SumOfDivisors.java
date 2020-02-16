package main.hw2;

import java.util.*;

public class SumOfDivisors {
	public static void main(String[] args) { 
		
	  Scanner sc = new Scanner(System.in);
      System.out.println("Enter required number: ");
      int num = sc.nextInt();
		System.out.println(divSum(num)); 
	} 

	 static int divSum(int num)	{ 
	
		int result = 0; 
	
		for (int i = 2; i <= Math.sqrt(num); i++) {
			
		   if (num % i == 0) {
			   
		    	if (i == (num / i)) 
		    		
					result += i; 
				else
					result += (i + num / i); 
			} 
		}	
			return (result + 1); 
	} 
} 