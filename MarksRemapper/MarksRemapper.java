
import java.util.Scanner;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

public class MarksRemapper {
	public static Scanner input = new Scanner(System.in);
	static double desiredAverage = 60;
	static double desiredStandardDeviation = 20;

	public static void main(String[] args) {

		System.out.print("Enter all percentages (separated by spaces): ");
		String percentageString = input.nextLine();
		if(percentageString.length() == 0) 
			return;
		String[] percentageList = percentageString.split(" ");
		double[] gradeArray = new double [percentageList.length];
	
		Scanner strScanner = new Scanner(percentageString);
		int j = 0;
		while (strScanner.hasNext())
		{
			if(strScanner.hasNextDouble())
			{
				double num = strScanner.nextDouble();
				if (num < 0) {
					System.out.println( "Error: " + num + " is not a valid number.");
					num = 0;
				}
				if (num > 100) {
					System.out.println( "Error: " + num + " is not a valid number.");
					num = 100;
				}
				gradeArray[j] = num;
				j++;
			}
			else
			{
				String item = strScanner.next();
				System.out.println(" Error: " + item + " is not a valid number.");
			}
		}
		
		if (j == 0)
			return;
		
		double [] gradeArray2 = new double[j];
		for (int index = 0; index < gradeArray2.length; index++)
			gradeArray2[index] = gradeArray[index];

		double average = determineAverage(gradeArray2); 
		double standardDeviation = determineStandardDeviation(gradeArray2, average);  
		System.out.printf("The original average was %.1f and the standard deviation was %.1f\n", average, standardDeviation);
		boolean normalizedMark = modifyAllMarks(gradeArray2, desiredAverage, desiredStandardDeviation);
	}

	public static double determineAverage(double[] arrayOfNumbers)  
	{	
		if (arrayOfNumbers == null || arrayOfNumbers.length == 0)
			return 0; 
		
		double total = 0.0;
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
        	total += arrayOfNumbers[i];
        }
        double average = total / arrayOfNumbers.length;
		return average;
	}
	
	public static double determineStandardDeviation(double[] arrayOfNumbers, double average)  
	{
		if (arrayOfNumbers == null || arrayOfNumbers.length == 0 || arrayOfNumbers.length == 1)
			return 0;
		
		double sumOfSquaredDifferences = 0.0;

		for (int index = 0; index < arrayOfNumbers.length; index++)
		{
			sumOfSquaredDifferences += Math.pow(arrayOfNumbers[index] -
					average, 2.0);
		}
		double standardDeviation = Math.sqrt(sumOfSquaredDifferences / (arrayOfNumbers.length));
		
		return standardDeviation;
	}
	
	public static boolean modifyAllMarks(double[] arrayOfMarks, double desiredAverage, double desiredStandardDeviation)
	{
		if (arrayOfMarks == null || arrayOfMarks.length == 0)
			return false;
		
		double[] normalizedMark = new double [arrayOfMarks.length];
		
		double average = determineAverage(arrayOfMarks);
		double standardDeviation = determineStandardDeviation(arrayOfMarks, average);
		
		for (int i = 0; i < arrayOfMarks.length; i++)
		{	
			if (standardDeviation == 0)
				normalizedMark[i] = desiredAverage + (arrayOfMarks[i] - average);
			else 
				normalizedMark[i] = desiredAverage + (arrayOfMarks[i] - average) * desiredStandardDeviation / standardDeviation;
			if (normalizedMark[i] < 0)
				normalizedMark[i] = 0;
			if (normalizedMark[i] > 100)
				normalizedMark[i] = 100;
			
			if (i != arrayOfMarks.length - 1)	
				System.out.printf("%.1f->%.1f, ", arrayOfMarks[i], normalizedMark[i]); 
			else 
				System.out.printf("%.1f->%.1f ", arrayOfMarks[i], normalizedMark[i]);
		}
		System.out.println();

		double newAverage = determineAverage(normalizedMark);
		double newStandardDeviation = determineStandardDeviation(normalizedMark, newAverage);
		System.out.printf("The new average is %.1f and the new standard deviation is %.1f \n" , newAverage, newStandardDeviation);

		if (standardDeviation != 0 && desiredStandardDeviation == 0)
			return false;
		
		if (standardDeviation == 0 && desiredStandardDeviation != 0)
			return false;
		
		if (average > 0 && desiredAverage == 0)
			return false;

		return true;
	}	
}
