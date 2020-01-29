package main;
import java.util.*;

public class Factorial {
		   
		public static void main(String[] args) {
		
	            long n, fact = 1;
		
		    Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the number: ");
		   
	            n = sc.nextLong();
	            if (n > 0 && n < 13) {
	            	
		    for(int i=1; i<=n; i++)  {
		
		    fact = fact * i;
		    
		        }
	         }
		    else {
		    	 System.out.println("Number is out of range");	
		   		    }
       			 	    
	   	    System.out.println("fact= " + fact);
	}
}
	


