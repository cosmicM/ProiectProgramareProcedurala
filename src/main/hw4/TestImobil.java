package main.hw4;

public class TestImobil {
	 public static void main(String[] args) {
		 
	  Imobil apartament = new Imobil();
	  	  	  
	  apartament.setnrEtaje(8);
	  apartament.settipCasa("Apartament");
	  apartament.setPret(55.000);
	  
	  Imobil cabana = new Imobil("Cabana");
	  
	  cabana.setnrEtaje(2);
	  cabana.setPret(200.221);
	  
	  Imobil vila = new Imobil("Vila", 4 , 145.100);
	   	  
   	  
     System.out.println("Tip Imobil: " + apartament.gettipCasa() + "\nnrEtaje: " + apartament.getnrEtaje() + "\npret: " + apartament.getPret());
     System.out.println("====================");
     System.out.println("Tip Imobil: " + cabana.gettipCasa() + "\nnrEtaje: " + cabana.getnrEtaje() + "\npret: " + cabana.getPret());
     System.out.println("====================");
     System.out.println("Tip Imobil: " + vila.gettipCasa() + "\nnrEtaje: " + vila.getnrEtaje() + "\npret: " + vila.getPret());
   	  
	 }
}
