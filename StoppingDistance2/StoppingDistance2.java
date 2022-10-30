
/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable and constant names?
       Mark out of 15:   15
       Comment: I used easy-to-understand meaningful variable and constant names
   2. Did I format the variable and constant names properly?
       Mark out of 5:   5
       Comment: I formatted the variable and constant names properly
   3. Did I indent the code appropriately?
       Mark out of 10:   10
       Comment: I indented the code appropriately
      Total Mark out of  30 (Add all the previous marks):  30
*/

import java.util.Scanner;

public class StoppingDistance2 {

	public static void main(String[] args) {

		final int FIFTY = 50;
		final int FIFTYNINE = 59;
		final int SIXTY = 60;
		final double WET_COEFFICIENT_FRICTION = 0.4;
		final double DRY_COEFFICIENT_FRICTION = 0.8;

		System.out.print("Enter vehicle speed in km/hr>");
		Scanner inputScanner = new Scanner(System.in);
		double speed = inputScanner.nextDouble();

		System.out.print("Enter age in years>");
		int age = inputScanner.nextInt();
		
		System.out.print("Is the road wet (Yes/No)?");
		String wetOrDryRoadAnswer = inputScanner.next();
		boolean wet = wetOrDryRoadAnswer.equalsIgnoreCase("Yes");
		
		double coefficientFriction = 0;
		if (!wet) {	
			coefficientFriction = DRY_COEFFICIENT_FRICTION;
			System.out.printf("As the road is dry, the coefficient of friction is 0.8 \n");
		}

		if (wet){
			coefficientFriction = WET_COEFFICIENT_FRICTION;
			System.out.printf("As the road is wet, the coefficient of friction is 0.4 \n");
		}
		
		
		double reactionTime = 0;
		if (age < FIFTY){
			reactionTime = 2.0;
			System.out.println("As the driver is " + age + " years old, his/her reaction time is 2.0s");
		}
		else if (age >= FIFTY && age <= FIFTYNINE){
			reactionTime = 2.5;
			System.out.println("As the driver is " + age + " years old, his/her reaction time is 2.5s");
		}
		else if (age >= SIXTY){
			reactionTime = 3.0;
			System.out.println("As the driver is " + age + " years old, his/her reaction time is 3.0s");
		}

		
		double brakingDistance = (speed * speed) / (250 * coefficientFriction);
		double speedInMetersPerSecond = (speed / 3.6);
		double reactionDistance = (speedInMetersPerSecond * reactionTime);
		double stoppingDistance = (reactionDistance + brakingDistance);
		
		System.out.printf("At a speed of %.1fkm/hr, the reaction distance is %.0fm, "
				+ "the braking distance is %.0fm, and so the stopping distance is %.0fm", 
				speed, reactionDistance, brakingDistance, stoppingDistance);
		
	}
}





