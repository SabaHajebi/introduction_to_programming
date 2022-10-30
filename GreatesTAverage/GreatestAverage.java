import java.util.Scanner;

public class GreatestAverage {

	public static void main(String[] args) {
		 System.out.println("Enter list of numbers: ");
	        Scanner input = new Scanner(System.in);
	        String listOfNum = input.nextLine();
	        int[] numArray = readArrayOfNumbers(listOfNum);
	        int size = numArray.length; 
	        for(int i = 0; i < numArray.length; i++)
	        	System.out.println(numArray[i]);
	        
	        ;
	        System.out.println(average(listOfNum, size));

	}

	public static int[] readArrayOfNumbers(String listOfNum) {
		String s [] = listOfNum.split(", ");
		int[] numArray = new int[s.length];
		for(int i = 0; i < s.length; i++) {
			numArray[i] = Integer.parseInt(s[i]);
		}
				
		return numArray;
	}
	
	public static double average(String listOfNum, int size) {
		int[] numArray = readArrayOfNumbers(listOfNum);
		size = numArray.length;
		double sum = 0;
		for(int i = 0; i < size; i++) {
			 sum =+ numArray[i];
		}
		
		return sum / size;
		
	}

}
