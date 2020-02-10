package main.hw2;
import java.util.*;

public class EvenOdd {
	
	 public static void main(String args[])
	  {
	    int n;
	    System.out.println("Enter an Integer number: ");

	    //Intrarea data de utilizator este stocata in n
	    Scanner input = new Scanner(System.in);
	    n = input.nextInt();

	    /*Daca nr este divizibil cu 2, atunci este even, altfel
	     este odd.*/
	    if ( n % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	    input.close();
	  }
	}

