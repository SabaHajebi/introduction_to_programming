import java.util.Scanner;

public class ECTs {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean finish = false;

		System.out.print("Enter the ECTS (credits) associated with the course > ");
		 String ECTSString = input.nextLine();

		   System.out.print("Enter student percentages > ");
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

			double[] ECTSArray = null;
			double average = weightedAverage(gradeArray2, ECTSArray); 
			System.out.printf("The weighted average is %.2f%%", average);
	}
	
	

	static double weightedAverage(double arrayOfNumbers[], double arrayOfCredits[])
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

}
