
import java.util.Scanner;
public class stringExcersies {

	public static void main(String[] args) {
		String exampleString = "The quick brown fox!";
		 int index1 = exampleString.charAt(0);
	        int index2 = exampleString.charAt(10);

	      
	        System.out.println("The character at position 0 is " +
	            (char)index1);
	        System.out.println("The character at position 10 is " +
	            (char)index2);
	        
	        Scanner input = new Scanner(System.in);
	        System.out.print("Input a string: ");
	        String str = input.nextLine();
	        System.out.print("The middle character in the string: " + middle(str)+"\n");
	        
	        System.out.print("Input a number: ");
	        int number = input.nextInt();
	        String numberString = Integer.toString(number);
			numberString = ' ' + numberString + ' ';

			for (int i = 1; i < numberString.length() - 1; i++)
			{
				if (numberString.charAt(i) != numberString.charAt(i - 1) &&
						numberString.charAt(i) != numberString.charAt(i + 1))
					System.out.print("the number is not the same");
				
				else 
					System.out.print("the number is the same");
			}
					
	}
	        public static String middle(String str)
	        {
	            int position;
	            int length;
	            if (str.length() % 2 == 0)
	            {
	                position = str.length() / 2 - 1;
	                length = 2;
	            }
	            else
	            {
	                position = str.length() / 2;
	                length = 1;
	            }
	            return str.substring(position, position + length);
	           

	}

}
