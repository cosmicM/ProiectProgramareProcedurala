package main;

public class ClasaPrincipala {

	public static void main(String[] args) {
		
		Mediu m = new Mediu();
		m.method1();
		m.method2();
		System.out.println("Hello world!");

	//Ex2
		double d = 2.95;
			int j = 4;
			System.out.println(++d > j ? d:j);
// (j>d) deci afiseaza j(4)

   //Ex3
       int a = 3;
       if (++a < 4) 
    	   if (a++ < 4)
    		   System.out.println(a);
    	   else 
    		   System.out.println(a); 
//consola nu va afisa pentru ca 
//nu este indeplinita prima conditie "if (++a <4)
   
     //Ex4
        int suma = 0;
        for (int i = 1;i < 10;i++) 
                  suma += suma + i;
        
        System.out.print("Suma este: " + suma);
	}
}
//suma este 1013 deoarece suma=suma+suma+i
