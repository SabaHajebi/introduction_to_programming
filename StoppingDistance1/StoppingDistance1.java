/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 5:    5
       Comment: I used appropriate CONSTANTS instead of numbers within the code
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5:   5
       Comment: I used easy-to-understand, meaningful CONSTANT names
   3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5:   5
       Comment: I formated the CONSTANT names properly (in UPPERCASE)
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10:   10
       Comment: I used easy-to-understand meaningful variable names
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5:   5
       Comment: I formated the variable names properly (in lowerCamelCase)
   6. Did I indent the code appropriately?
       Mark out of 10:   10
       Comment: I indented the code appropriately
     Total Mark out of  40 (Add all the previous marks):  40
*/



import java.text.DecimalFormat;
import java.util.Scanner;

public class StoppingDistance1 {

	public static void main(String[] args) {
		
		System.out.print("Enter vehicle speed in km/hr> ");
		
		Scanner inputScanner = new Scanner(System.in);
		double speed = inputScanner.nextDouble();
		
        System.out.print("Enter reaction time in seconds> ");
		double reactionTime = inputScanner.nextDouble();
		inputScanner.close();
		
		double speedInMetersPerSecond = ((speed) * 1000.0) / 3600.0; 
		double reactionDistance = (speedInMetersPerSecond) * (reactionTime); 
		double brakingDistance = (speedInMetersPerSecond) * (speedInMetersPerSecond) / 20;
	    double stoppingDistance = (reactionDistance + brakingDistance);
	    
	    System.out.printf("At a speed of %.1fkm/hr and with a reaction time of %.1fs, the stopping distance would be %.1fm\n", 
	    		speed, reactionTime, stoppingDistance);
	}

}
