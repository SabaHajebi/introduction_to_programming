/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names?
       Mark out of 5:   5
       Comment: I used easy-to-understand meaningful variable names
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:   5
       Comment: I formated the variable names properly (in lowerCamelCase)
   3. Did I indent the code appropriately?
       Mark out of 5:   5
       Comment: I indented the code appropriately
   4. Did I implement a while loop or do-while loop as required?
       Mark out of 10:   10
       Comment: I implemented a while loop or do-while loop as required
      Total Mark out of  25 (Add all the previous marks):  25
*/

import java.util.Scanner;
public class RangeOfHeights {
	
	public static void main(String[] args) {
	
		double maxHeight = 0.0;
		double minHeight = 0.0;
		boolean finishFlag = false;
		Scanner input = new Scanner( System.in );
		
		while (finishFlag == false) {
			System.out.print("Enter a height in metres (0.0 to finish)> ");
		    double currentHeight = input.nextDouble();
		    
		    if (currentHeight < 0.0)
				System.out.println("Negative heights are invalid.");
		    else if (currentHeight == 0.0)
		    	finishFlag = true;
		    else 
		    {
			    if (currentHeight < minHeight || minHeight == 0.0)
					minHeight = currentHeight;
				if (currentHeight > maxHeight)
					maxHeight = currentHeight;
	
				System.out.println("Heights entered so far are in the range " 
					+ minHeight + " to " + maxHeight );
		    } // end else
		} // end while
		input.close();
	} // end main
} // end class


	


