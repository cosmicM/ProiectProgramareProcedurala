package main.hw3;

//Exercitiul5
public class EvenUpperCase {
	public static void main(String[] args) {
    	
        String sample = "simplicity";
        StringBuffer updateString = new StringBuffer();
        char[] characters = sample.toCharArray();
        
        for (int index = 0; index < characters.length; index++) {
        	char c= characters[index]; //take the characters
        	
        	if (index % 2 != 0) { //find even element
        		c = Character.toUpperCase(c);
        		
        	}
        	updateString.append(c);//reconstruct the string
        }
           System.out.println("Modified string is :" +  updateString.toString());
        }
	}


