package main;

public class Mediu {
	int x = 0; 
	void method1() {
		int x = 1;
		 //var locale metodei method1
		
	}
    void method2() {
    	
    	int z = 1; //var locala metodei method2
    	System.out.println(x);
    	x = 1+z; //y este necunoscut ->deci nu se poate face aceast operatie
        System.out.println(x); 			
    }
}


