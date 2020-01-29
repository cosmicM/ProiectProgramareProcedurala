package main;

public class Assign {
  public static void main(String[] args) {
	  int a = 3;
	  int b = (a = 2) * a;
	  int c = b * (b = 5);
	  System.out.println("a=" + a +", b=" + b +", c=" + c);
    }
}
//se va afisa a=2, b=5 si c=20
//se retin valorile finale ale variabilelor la afisare

 