import java.util.Scanner;

public class EtestSample {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean quit = false;
		do {
			System.out.println("Enter the positive whole number to be considered (or 'quit')> ");
			if (input.hasNext("quit")) 
				quit = true;
			
			else if (!input.hasNextInt())
			
				System.out.println("Error: " + input.next() + " is not a positive whole number");
				
			else if (input.hasNextInt())
			{	
				int number = input.nextInt();
				int lastProperDivisor = 0;
				int divisor = computeNextProperDivisor(number, lastProperDivisor);
				int sum = sumOfProperDivisors(number);
				String DeficientPerfectOrAbundant =  isDeficientPerfectOrAbundant(number);
		
				if (isAdmirable(number))
					System.out.println( number + " is " + DeficientPerfectOrAbundant + " and is Admirable");
				
				else 
					System.out.println( number + " is " + DeficientPerfectOrAbundant + " and is not Admirable");	
			}
			
		} while (!quit);
		
	}
	
	 static int computeNextProperDivisor( int number, int lastProperDivisor ) 
	 {
		 if ((lastProperDivisor > 0) && (lastProperDivisor < number) &&
				 (number % lastProperDivisor == 0))
		 {
			 int divisor = lastProperDivisor;
			 
			 do {
				 divisor++;
			 } while (number % divisor != 0);
			 return divisor;
		 }
		 return -1;
	}
	 
	 static int sumOfProperDivisors(int number)
	 {
	    int sum = 0;
	    
        for(int i = 1; i < number; i++) 
        {
             if (number % i == 0) 
                 sum = sum + i; 
        }
		 return sum;
	 }
	 
	 
	 static String isDeficientPerfectOrAbundant(int number)
	 {
		int sum = sumOfProperDivisors(number);
		String resultString = "";
		
		if (sum < number) {
			resultString = "Deficient";
		}
		
		if (sum == number) {
			 resultString = "Perfect";
		}
		
		if (sum > number) {
			resultString = "Abundant";	
		}
		return resultString;
	 }
	 
	 static boolean isAdmirable( int number )
	 {
		 int sigmaN = sumOfProperDivisors(number);
		
		    for (int i = 2; i <= Math.sqrt(number); i++)
		    {
		        if (number % i == 0)
		        {
		            if (i == (number / i))
		            {
		                if (sigmaN - 2 * i == 2 * number)
		                    return true;
		            }
		            else
		            {
		                if (sigmaN - 2 * i == 2 * number)
		                    return true;
		                if (sigmaN - 2 * (number / i) == 2 * number)
		                    return true;
		            }
		        }
		    }
		  
		    if (sigmaN - 2 * 1 == 2 * number)
		        return true;
		 
		    return false;
	 }
}