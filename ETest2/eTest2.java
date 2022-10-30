import java.util.Scanner;

public class eTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.println("Enter the positive whole number to be considered (or 'quit')> ");

		if (!input.hasNextInt())

			System.out.println("Error: " + input.next() + " is not a positive whole number");

		else if (input.hasNextInt())	
		{
			int number = input.nextInt();

			System.out.print("The numbers whose squares are less than or equal to " + number + " are ");

			for(int i = 1; i < number; i++) 
			{
				if (i * i <= number) {
					System.out.print(", " + i);

					continue;

				}
				else 
					break;
			}

		}


	}

}
