import java.util.Scanner;

/*
 * Write a program to compute the maximum and minimum numbers in a
 * list of numbers entered by the user (on a single line).
 */
public class MinMax {

	public static void main(String[] args)
	{
		System.out.print("Enter your list of numbers separated by spaces:");
		Scanner input = new Scanner( System.in );
		String myLine = input.nextLine();
		Scanner inputLine = new Scanner( myLine );
		if (inputLine.hasNextDouble())
		{
			double minimumNumber = inputLine.nextDouble();
			double maximumNumber = minimumNumber;
			while (inputLine.hasNextDouble())
			{
				double currentNumber = inputLine.nextDouble();
				if (currentNumber < minimumNumber)
					minimumNumber = currentNumber;
				if (currentNumber > maximumNumber)
					maximumNumber = currentNumber;
			}
			System.out.println("The numbers you entered are between " +
				             	minimumNumber + " and " + maximumNumber );
		}
		else
		{
			System.err.println("Error: No numbers provided.");
		}
		inputLine.close();
		input.close();
	}
}