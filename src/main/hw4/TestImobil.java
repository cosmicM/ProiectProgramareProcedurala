package main.hw4;

public class TestImobil {
	 public static void main(String[] args) {
   	  
   	  Imobil apartament = new Imobil("apartament", 8 ,55.000);
   	  Imobil cabana = new Imobil("cabana", 2 ,200.221);
   	  Imobil vila = new Imobil("vila", 3 ,145.100);
   	  
     System.out.println("Tip Imobil: " + apartament.gettipCasa() + "\nnrEtaje: " + apartament.getnrEtaje() + "\npret: " + apartament.getPret());
     System.out.println("====================");
     System.out.println("Tip Imobil: " + cabana.gettipCasa() + "\nnrEtaje: " + cabana.getnrEtaje() + "\npret: " + cabana.getPret());
     System.out.println("====================");
     System.out.println("Tip Imobil: " + vila.gettipCasa() + "\nnrEtaje: " + vila.getnrEtaje() + "\npret: " + vila.getPret());
   	  
	 }
}
