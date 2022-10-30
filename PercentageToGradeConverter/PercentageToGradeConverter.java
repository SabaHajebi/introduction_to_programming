/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names?
       Mark out of 5:   5
       Comment:  I used easy-to-understand meaningful variable names
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:   5
       Comment: I formatted the variable names properly (in lowerCamelCase)
   3. Did I indent the code appropriately?
       Mark out of 5:   5
       Comment: I indented the code appropriately
   4. Did I implement a switch statement as required?
       Mark out of 10:   10
       Comment: I implemented a switch statement as required
   5. Did I implement a switch statement as required?
       Mark out of 10:   10
       Comment: I implemented a switch statement as required
     Total Mark out of  25 (Add all the previous marks):  25
*/

import java.util.Scanner;


public class PercentageToGradeConverter {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    boolean quitFlag = false;	   
		
		do
		 {
			System.out.print("Enter a percentage (or 'quit' to finish)> ");
			if (input.hasNext("quit")) {
				quitFlag = true;
			}
			else if (input.hasNextDouble())
			{
				double percentage = input.nextDouble();
				if (percentage < 0 || percentage > 100.0)
					System.out.println("Error: Percentages must be between 0.0% and 100.0%");
				else {
					int num = (int) Math.floor(Math.round(percentage) / 10);
					switch (num) {
			
						case 10:
						case 9:
						case 8:
						case 7:
							System.out.println("The grade for " + percentage + "% is a I ");
							break;
						
						case 6:
							System.out.println("The grade for " + percentage + "% is a II.1");
							break;
						
						case 5:
							System.out.println("The grade for " + percentage + "% is a II.2");
							break;
					
						case 4:
							System.out.println("The grade for " + percentage + "% is a III");
							break;
					
						case 3:
							if (Math.round(percentage) >= 35.0 && Math.round(percentage) < 40.0) {
								System.out.println("The grade for " + percentage + "% is an F1");
							break;
							}
						case 2:
							if (Math.round(percentage) >= 0.0 && Math.round(percentage) < 35.0)
								System.out.println("The grade for " + percentage + "% is an F2");
							break;
						case 1:
							  System.out.println("The grade for " + percentage + "% is an F2");
							  break;
	
						default:
							System.out.println("The grade for " + percentage + "% is an F2");
					}
				}
			}
			else {					
				System.out.println("Error: Percentages must be between 0.0% and 100.0%" );
				input.nextLine();
			}

		} while (!quitFlag);
		input.close();
	}
}


