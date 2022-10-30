/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful and properly formatted variable names and constants?
       Mark out of 5:   5
       Comment: I used easy-to-understand meaningful and properly formatted variable names and constants
    2. Did I indent the code appropriately?
       Mark out of 5:   5
       Comment: I indented the code appropriately
   3. Did I make use of the functions appropriately within main and the other functions?
       Mark out of 5:   5
       Comment: I made use of the functions appropriately within main and the other functions
   4. Have I avoided inappropriate duplication of code?
       Mark out of 5:   5
       Comment: I avoided inappropriate duplication of code
     Total Mark out of  20 (Add all the previous marks): 20 
*/
import java.util.Scanner;
public class StoppingDistance3 {

	public static final double ICY_COEFFICIENT_FRICTION = 0.1;
	public static final double WET_COEFFICIENT_FRICTION = 0.4;	  	
	public static final double DRY_COEFFICIENT_FRICTION = 0.8;
	

	public static void main(String[] args) {   

		boolean roadIsWet = false;
		boolean roadIsIcy = false;
		boolean flagSpeedOkay = false;
		boolean flagAgeOkay = false;
		double vehicleSpeed = 0.0;
		int age = 0;
		Scanner inputScanner = new Scanner(System.in);
		
		do 
		{
			System.out.print("Enter vehicle speed in km/hr> ");
			try 
			{
				vehicleSpeed = inputScanner.nextDouble();
			}
			catch (Exception e)
			{
				System.out.println("Error: Enter a positive number for the speed of the vehicle.");
				inputScanner.next();
				continue;
			}
			if (vehicleSpeed < 0.0)
				System.out.println("Error: Enter a positive number for the speed of the vehicle.");
			else 
				flagSpeedOkay = true;
		} while (!flagSpeedOkay);
		
		
		do 
		{
			System.out.print("Enter age in years> ");
			try
			{ 
				age = inputScanner.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("Enter a positive whole number for the age of the driver.");
				inputScanner.next();
				continue;
			}
			if (age <= 0) 
				System.out.println("Error: Enter a positive whole number for the age of the driver.");
			else
				flagAgeOkay = true;

		} while (!flagAgeOkay);
		
		while (true)
		{
			System.out.print("Is the road wet (Yes/No)? ");
			String wetOrDryRoadAnswer = inputScanner.next(); 
			roadIsWet = wetOrDryRoadAnswer.equalsIgnoreCase("Yes");
			if (wetOrDryRoadAnswer.equalsIgnoreCase("Yes"))
				break;
			else if (wetOrDryRoadAnswer.equalsIgnoreCase("No"))
				break;
			else 
				System.out.println("Error: You must enter either Yes or No.");
		}
				
		while (true)
		{
			System.out.print("Is the road icy (Yes/No)? ");
			String icyRoadAnswer = inputScanner.next(); 	
			roadIsIcy = icyRoadAnswer.equalsIgnoreCase("Yes");
			if (icyRoadAnswer.equalsIgnoreCase("Yes"))
				break;
			else if (icyRoadAnswer.equalsIgnoreCase("No"))
				break;
			else 
				System.out.println("Error: You must enter either Yes or No.");
		}
		inputScanner.close();
		
		int stoppingDistance = 0;
		stoppingDistance = computeStoppingDistance(vehicleSpeed, age, roadIsIcy, roadIsWet);
	}


	public static double computeCoefficientOfFriction(boolean roadIsIcy, boolean roadIsWet)
	{
		double coefficientFriction = 0.0;
		if (roadIsWet & roadIsIcy)	
		{
			coefficientFriction = ICY_COEFFICIENT_FRICTION;	
			System.out.printf("As the road is icy and wet, the coefficient of friction is %.1f \n", coefficientFriction);
		}
		else if (roadIsWet && !roadIsIcy)
		{    
			coefficientFriction = WET_COEFFICIENT_FRICTION;
			System.out.printf("As the road is wet, the coefficient of friction is %.1f \n", coefficientFriction);
		}
		else if (!roadIsWet && roadIsIcy)
		{    
			coefficientFriction = ICY_COEFFICIENT_FRICTION;
			System.out.printf("As the road is icy and dry, the coefficient of friction is %.1f \n", coefficientFriction);
		}
		else if (!roadIsWet && !roadIsIcy)
		{    
			coefficientFriction = DRY_COEFFICIENT_FRICTION;
			System.out.printf("As the road is dry, the coefficient of friction is %.1f \n", coefficientFriction);
		}

		return coefficientFriction;
	}
	
	
	public static double computeBrakingDistance(double vehicleSpeed, boolean roadIsIcy, boolean roadIsWet)
	{
		double brakingDistance = ( vehicleSpeed * vehicleSpeed) / (250 * computeCoefficientOfFriction(roadIsIcy, roadIsWet));
		return (brakingDistance);
	}
	
	
	public static double computeReactionDistance(double vehicleSpeed, int age)
	{
		age = (age - 24);
	    double reactionTime = (1.0 + (Math.abs(age)*0.05));
		double speedInMetersPerSecond = (vehicleSpeed / 3.6);
		double reactionDistance = (speedInMetersPerSecond * reactionTime);
		return (Math.round(reactionDistance));
	}
	
	public static int computeStoppingDistance(double vehicleSpeed, int age, boolean roadIsIcy, boolean roadIsWet)
	{
		double brakingDistance = computeBrakingDistance(vehicleSpeed, roadIsIcy, roadIsWet);
	
		double reactionDistance = computeReactionDistance( vehicleSpeed, age);
		
		int stoppingDistance = (int)(reactionDistance  + brakingDistance);
		
		System.out.printf("At a speed of " + vehicleSpeed + "km/hr, a driver who is " + age + " years old,"
				+ " the reaction distance is %.0fm, the braking distance is %.0fm, and so the stopping distance is %dm"
				, reactionDistance, brakingDistance, stoppingDistance);

		return (Math.round(stoppingDistance));
	}
}




