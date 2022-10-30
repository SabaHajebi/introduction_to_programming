import java.util.Scanner;

public class ETest3 {
	static int PRIME_CHECKER = 2;


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxNum = 0;
		int minNum = 0;
		System.out.print("Enter the minimum positive whole number to be considered>  ");
		if (!input.hasNextInt()) {
			System.out.println(" Error: " + input.next() + " is not a positive whole number.");
		}

		else {
			minNum = input.nextInt();
			//System.out.println(isPrime(minNum));
			//System.out.println(isPowerful(minNum));
			//System.out.println(reverseNumber(minNum));
			
			if (minNum <= 0)
			{
				System.out.println(" Error: " + minNum + " is not a positive whole number.");

			}

		}
		System.out.println("Enter the maximum positive whole number to be considered>  ");
		if (!input.hasNextInt()) {
			System.out.print(" Error: " + input.next() + " is not a positive whole number.");
		}
		else {
			maxNum = input.nextInt();
			if (maxNum <= 0)
			{
				System.out.println(" Error: " + maxNum + " is not a positive whole number.");
			}
		}
		if (maxNum < minNum)
			System.out.println(" Error: The maximum cannot be less than the minimum.");
		
		
		if (isPalindromic(minNum) && isPowerful(minNum))
			System.out.println("The numbers which are both palindromic and powerful between " 
		+ minNum + " and " + maxNum + " are " );
		if (isPalindromic(maxNum) && isPowerful(maxNum))
			System.out.println("The numbers which are both palindromic and powerful between " 
		+ minNum + " and " + maxNum + " are " );
		
		if (!isPalindromic(minNum) && !isPowerful(minNum))
			System.out.println("There are no numbers which are both palindromic and powerful between " 
		+ minNum + " and " + maxNum);
		if (!isPalindromic(maxNum) && !isPowerful(maxNum))
			System.out.println("There are no numbers which are both palindromic and powerful between " 
		+ minNum + " and " + maxNum);
		
	}
	


	public static int reverseNumber(int number) {
		int reversedNumber = 0;
		int tempNumber1 = 0;
		int tempNumber2 = number;

		while (number > 1) {
			tempNumber1 = tempNumber2 % 10;
			reversedNumber = (reversedNumber * 10 ) + tempNumber1;
			tempNumber2 = tempNumber2 / 10;
		}
		return reversedNumber;

	}

	public static boolean isPrime(int number) {

		while (number > PRIME_CHECKER )
		{
			if (number % PRIME_CHECKER == 0)
				return false;
			PRIME_CHECKER++;
		}
		return true;
	}

	public static boolean isPalindromic(int number) {
		int reversedNum = reverseNumber(number);
		if (reversedNum == number)
			return true;
		else
			return false;

	}

	public static boolean isPowerful(int number) {
		if (isPrime(number)) {
			int primeNum = number;
			int newNum = number / primeNum;
			int squaredPrime = primeNum * primeNum;
			int newSquaredPrime = number / squaredPrime;
			if (newNum == 0 && newSquaredPrime == 0)
				return true;
		}
		return false;

	}
}
