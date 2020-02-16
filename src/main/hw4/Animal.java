package main.hw4;


public class Animal {
	
   private String tipAnimal;
   private String culoare;
   private int varsta; 

public Animal(String tipAnimal, String culoare, int varsta) {
	
	this.tipAnimal = tipAnimal;
	this.culoare = culoare;
	this.varsta = varsta;
}

public String gettipAnimal() { return tipAnimal;}

public void settipAnimal(String tipAnimal) {this.tipAnimal = tipAnimal;}

public String getCuloare() {return culoare;}

public void setCuloare(String culoare) {this.culoare = culoare;}

public int getVarsta() {return varsta;}

public void setVarsta(int varsta) {this.varsta = varsta;}
}


