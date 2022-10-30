/* SELF ASSESSMENT 
   1.    createSequence:
Did I use the correct method definition?
Mark out of 5: 5
Comment: I used the correct method definition
Did I create an array of size n (passed as the parameter) and initialise it?
Mark out of 5: 5
Comment:  I created an array of size n (passed as the parameter) and initialise it
Did I return the correct item?
Mark out of 5: 5
Comment: I returned the correct item
   2.    crossOutMultiples
Did I use the correct method definition?
Mark out of 5: 5
Comment: I used the correct method definition
Did I ensure the parameters are not null and one of them is a valid index into the array
Mark out of 2: 2
Comment: I ensured the parameters are not null and one of them is a valid index into the array
Did I loop through the array using the correct multiple?
Mark out of 5: 5
Comment: I looped through the array using the correct multiple
Did I cross out correct items in the array that were not already crossed out?
Mark out of 3: 3
Comment: crossed out correct items in the array that were not already crossed out
   3.    sieve   
Did I have the correct function definition?
Mark out of 5: 5
Comment: I had the correct function definition
Did I make calls to other methods?
Mark out of 5: 5
Comment: I made calls to other methods
Did I return an array with all non-prime numbers are crossed out?
Mark out of 2: 2
Comment: I returned an array with all non-prime numbers are crossed out
   4.    sequenceTostring  
Did I have the correct function definition?
Mark out of 5: 5
Comment: I have the correct function definition
Did I ensure the parameter to be used is not null?
Mark out of 3: 3
Comment: I ensure the parameter to be used is not null
Did I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets? 
Mark out of 10: 10
Comment: I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets
   5.    nonCrossedOutSubseqToString  
Did I have the correct function definition
Mark out of 5: 5
Comment: I have the correct function definition   
Did I ensure the parameter to be used is not null?  
Mark out of 3: 3
Comment: I ensure the parameter to be used is not null?  
Did I loop through the array updating the String variable with just the non-crossed out numbers? 
Mark out of 5: 5
Comment: I loop through the array updating the String variable with just the non-crossed out numbers? 
   6.    main  
Did I ask  the user for input n and handles input errors?  
Mark out of 5: 5
Comments: I ask  the user for input n and handles input errors
Did I make calls to other methods (at least one)?
Mark out of 5: 5
Comment:  I make calls to other methods (at least one)
Did I print the output as shown in the question?  
Mark out of 5: 5
Comment:  I print the output as shown in the question
   7.    Overall
Is my code indented correctly?
Mark out of 4: 4
Comments: my code indented correctly
Do my variable names make sense?
Mark out of 4: 4
Comments: my variable names make sense
Do my variable names, method names and class name follow the Java coding standard
Mark out of 4: 4
Comments: my variable names, method names and class name follow the Java coding standard
      Total Mark out of 100 (Add all the previous marks): 100
 */
import java.util.Scanner;

public class SieveOfEratosthenes {
	public static void main(String[] args) {
		int N = 0;
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter int >= 2 : ");
			N = input.nextInt();
			if (N < 2)
				System.out.print("Error: Please enter an integer greater than 2");
			input.close();
		}
		catch(Exception e)
		{
			System.out.print("Error: Please enter an integer");
			return;
		}
		int[][] sequence = new int[N - 1][2];
		sequence = sieve(N);
		System.out.println(nonCrossedOutSubseqToString(sequence));
	}

	public static int[][] createSequence(int N) {
		int seqInit = 2;
		int[][] sequence = new int[N - 1][2];
		for (int i = 0; i < N - 1; i++) {
			sequence[i][0] = seqInit;
			sequence[i][1] = 0;
			seqInit++;
		}
		System.out.println(seqToString(sequence));
		return sequence;
	}

	public static int[][] crossOutHigherMultiples(int[][] sequence, int num) {
		for (int i = num - 1; i < sequence.length; i++) {
			if (sequence[i][0] % num == 0)
				sequence[i][1] = 1;
			}
		return sequence;
	}

	public static int[][] sieve(int N) {
		int[][] sequence = createSequence(N);
		for (int i = 0; i < Math.sqrt(N); i++) {
			int num = sequence[i][0];
			if (sequence[i][1] != 1) {
				sequence = crossOutHigherMultiples(sequence, num);
				System.out.println(sequenceToString(sequence));
			}
		}
		return sequence;
	}

	public static String sequenceToString(int[][] sequence) {
		String sequenceString = "" ;
		for (int i = 0; i < sequence.length; i++) {
			if ((i < sequence.length - 1) && sequence[i][1] == 0)
				sequenceString += sequence[i][0] + ", ";
			if ((i < sequence.length - 1) && sequence[i][1] == 1)
				sequenceString += "[" + sequence[i][0] + "], ";
			if ((i == sequence.length - 1) && sequence[i][1] == 0)
				sequenceString += sequence[i][0];
			if ((i == sequence.length - 1) && sequence[i][1] == 1)
				sequenceString += "[" + sequence[i][0] + "]";

		}

		return sequenceString;
	}

	public static String nonCrossedOutSubseqToString(int[][] sequence)
	{
		String primeString = "2" ;
		for (int i = 0; i < sequence.length; i++) {
			if ((i < sequence.length - 1) && sequence[i][1] == 0)
				primeString +=", " + sequence[i][0] ;	
			if ((i == sequence.length - 1) && sequence[i][1] == 0)
				primeString += sequence[i][0];

		}
		return primeString;
	}

	public static String seqToString(int[][] sequence)
	{
		String seqString = "";
		for (int i = 0; i < sequence.length; i++) {
			if (i < sequence.length - 1)
				seqString += sequence[i][0] + ", ";	
			if (i == sequence.length - 1)
				seqString += sequence[i][0];

		}
		return seqString;
	}

}
