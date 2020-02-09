package main.hw3;


//Exercitiul6
public class SumDoubleIntVector {
	public static void main(String[] args) {
		
		int[] array = new int[] {0,9,2,8};
		double[] num = new double[array.length];
		double elem = 4.99;
		
		for(int i = 0; i < array.length; i++)
			num[i] = array[i] + elem;
		
		System.out.println("The new result vector :");
		
		for(int i = 0; i < num.length; i++)
			System.out.print(num[i] + "   ");
	}
}
