package main.hw3;
import java.util.*;

//Exercitiul3
public class NegNumArr {

	  private static Scanner sc;
	  public static void main(String[] args) 
	  {
	    int Size, i;
	    sc = new Scanner(System.in);
	    System.out.print(" Please enter number of elements in an array: ");
	    Size = sc.nextInt();  
	    int [] a = new int[Size];
	    System.out.print(" Please enter " + Size + " elements of an array: ");
	    for (i = 0; i < Size; i++)
	    {
	      a[i] = sc.nextInt();
	    }   
	    for(i = 0; i < Size; i++)
	    {
	      if(a[i] < 0)
	      {
	          System.out.println("Your negative number: " + a[i]);
	          sc.close();
	      }
	    }  
	  }
	}
	

