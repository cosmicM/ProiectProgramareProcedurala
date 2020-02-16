package main.hw4;

public class TestAnimal {
      public static void main(String[] args) {
    	  
    	  Animal caine = new Animal("caine","negru",5);
    	  Animal pisica = new Animal("pisica","galbena",2);
    	  Animal iepure = new Animal("iepure","albCuNegru",3);
    	  
      System.out.println("Tip animal: " + caine.gettipAnimal() + "\nCuloare: " + caine.getCuloare() + "\nVarsta: " + caine.getVarsta());
      System.out.println("====================");
      System.out.println("Tip animal: " + pisica.gettipAnimal() + "\nCuloare: " + pisica.getCuloare() + "\nVarsta: " + pisica.getVarsta());
      System.out.println("====================");
      System.out.println("Tip animal: " + iepure.gettipAnimal() + "\nCuloare: " + iepure.getCuloare() + "\nVarsta: " + iepure.getVarsta());
    	  
      }
      

}
