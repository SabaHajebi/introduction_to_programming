
/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable and constant names?
       Mark out of 10:   10
       Comment: I used easy-to-understand meaningful variable and constant names
   2. Did I format the variable and constant names properly (in lowerCamelCase and UPPERCASE)?
       Mark out of 5:   5
       Comment: I formated the variable and constant names properly (in lowerCamelCase and UPPERCASE)
   3. Did I indent the code appropriately?
       Mark out of 10:   10
       Comment: I indented the code appropriately
   4. Did I implement a for loop to read the input as required?
       Mark out of 10:   10
       Comment: I implemented a for loop to read the input as required
      Total Mark out of  35 (Add all the previous marks):  
*/


import java.util.Scanner;
public class FirstsAndPasses {
	
    public static final double MINIMUM_FIRST_CLASS_PERCENTAGE = 70.0;
    public static final double MINIMUM_MARK = 0.0;
    public static final double MAXIMUM_MARK = 100.0;
    public static final double MINIMUM_PASS_PERCERNTAGE = 40.0;
    
	public static void main(String[] args) {
		
		int numberOfFirstClass = 0;
		int numberOfPassed = 0;
				
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the number of students in the class> ");
		int classSize = 0; 
		classSize = inputScanner.nextInt();
		
		if (classSize <= 0) 
			System.out.printf("Error: The number of students must be greater than 0");
		else {
			
		    for (int number = 1; (number <= classSize); number++)
		    {
		    	System.out.printf("Enter the percentage obtained by student %d> ", number);
		    	double percentage = 0.0; 
		    	percentage = inputScanner.nextDouble();
		    	while (percentage <= MINIMUM_MARK || percentage > MAXIMUM_MARK) 
				{
					System.out.println("Invalid percentage. Please enter the mark again for this student.");
					System.out.printf("Enter the percentage obtained by student %d> ", number);
			    	percentage = inputScanner.nextDouble();
				}
		    	
		    	if (Math.round(percentage) >= MINIMUM_FIRST_CLASS_PERCENTAGE)
		    		numberOfFirstClass++;
		    	
		    	if (Math.round(percentage) >= MINIMUM_PASS_PERCERNTAGE)
		    		numberOfPassed++;   	
		    }
		    
		    double percentPassed = (numberOfPassed * 1.0 / classSize) * 100;
		    
		    System.out.printf("In this class of %d students, %d got a first class honour and %.1f%% passed the class", 
		    		classSize, numberOfFirstClass, percentPassed);
		}
	}
}	
