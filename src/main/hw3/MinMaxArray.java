package main.hw3;

//Exercitiul2
public class MinMaxArray {
	public static void main (String[] args){

	   int numbers[]= {0,-1,15,-8,16,10,-2,9,55,-18};
	   //Find minimum (lowest) value in array
	   
	   System.out.println("Minimum Value = " + getMinValue(numbers));
	} //Find maximum (largest) value in array
	
	   public static int getMaxValue(int[] numbers){
			int maxValue = numbers[0];
			for(int i = 1; i<numbers.length; i++){
				if(numbers[i] > maxValue){
					maxValue = numbers[i];
				}
			}
			return maxValue;
		}
	   public static int getMinValue(int[] numbers){
			int minValue = numbers[0];
			for(int i=1;i<numbers.length;i++){
				if(numbers[i] < minValue){
					minValue = numbers[i];
				}
			}
			return minValue;
		}
	}
