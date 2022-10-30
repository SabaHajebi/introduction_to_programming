import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		boolean quit = false;

		Scanner input = new Scanner(System.in);
		while(!quit) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			if (!input.hasNextInt()) {
				quit = true;
			}
			else {
				quit = false;
			}
			if(isDudenyNumber(number)) {
				System.out.println("The number is a dudney number");
				quit = true;
			}
			else 
				System.out.println("The number is NOT a dudney number");
			
			
			if(isFactorian(number)) {
				System.out.println("The number is a factorian number");
				quit = true;
			}
			else 
				System.out.println("The number is NOT a factorian number");

		}
		input.close();

	}

	public static boolean isDudenyNumber(int num) {
		int cubeRoot = (int)Math.round(Math.cbrt(num));
		if (cubeRoot * cubeRoot * cubeRoot != num)
			return false;

		int sum = 0;
		int temp = num;

		while(temp > 0) {
			int lastDigit = temp % 10;
			sum += lastDigit;
			temp /= 10;
		}

		if (cubeRoot != sum)
			return false;

		return true;
	}

	public static boolean isFactorian(int number) {

		int currentNumber = number;
		int sumOfFactorials = 0;
		do {
			sumOfFactorials += computeFactorial(currentNumber % 10);
			currentNumber /= 10;
		} while (currentNumber != 0);
		return (number == sumOfFactorials);

	}
	public static int computeFactorial(int number)
	{
		int result = 1;
		for (int index=2; (index<=number); index++)
			result *= index;
		return result;
	}

}
