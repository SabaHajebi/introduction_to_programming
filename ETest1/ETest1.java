import java.util.Scanner;

public class ETest1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		boolean quit = false;
		do {
			System.out.println("Enter the maximum positive whole number to be considered (or -1 to quit)> ");
			if (input.hasNext("-1")) 
				quit = true;

			else if (!input.hasNextInt())
				System.out.println(" Error: " + input.next() + " is not a positive whole number.");

			else if (input.hasNextInt())
			{	
				int number = input.nextInt();
				if (number < -1)
				{
					System.out.println(" Error: " + number + " is not a positive whole number.");
					continue;
				}

				int counter = 0;
				for (int num = 1; num <= number; num++)
				{
					if (isZygodrome(num) && isNude(num))
					{
						counter++;
						if (counter == 1)
							System.out.printf(" The numbers which are both zygodromes and nude up to %d are ", number );
						if (num == number)
							System.out.println(num);
						else
							System.out.printf("%d, ", num);
					}

				}
				if (counter == 0)
					System.out.println(" There are no numbers which are both zygodromes and nude up to " + number);


			}

		} while (!quit);

	}

	static boolean isNude(int number)
	{
		int digit = 0;
		int num = number;
		while (number != 0)
		{
			digit = number % 10;
			number = number / 10;

			if (digit == 0 || num % digit != 0)
				return false;
		}
		return true;
	}

	static int getNumberOfDigits(int number)
	{
		int numOfDigits = 0;

		while (number != 0) {

			number /= 10;
			++numOfDigits;
		}

		return numOfDigits;
	}

	static int getDigit(int number, int digitNumber) 
	{
		int numDig = getNumberOfDigits(number);
		if (digitNumber > numDig)
			return -1;
		int  modulus = 0;
		for (int i = 1; i <= numDig - (digitNumber - 1); i++)
		{
			modulus = number % 10;
			number = number / 10;
		}

		return modulus;
	}

	static boolean isZygodrome(int number)
	{
		String numberString = Integer.toString(number);

		numberString = ' ' + numberString + ' ';

		for (int i = 1; i < numberString.length() - 1; i++)
		{
			if (numberString.charAt(i) != numberString.charAt(i - 1) &&
					numberString.charAt(i) != numberString.charAt(i + 1))
			{
				return false;
			}
		}
		return true;
	}

}

