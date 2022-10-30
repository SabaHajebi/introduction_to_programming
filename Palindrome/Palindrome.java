import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		 Scanner input = new Scanner( System.in );
		 System.out.print("Please enter a number or word: ");
		    String inputString = input.nextLine();
		    
		    System.out.println("Original phrase: " + inputString);
		
		    String tempString = "";
			  char ch;
			for( int i = 0; i < inputString.length(); i++) {
		    	ch = inputString.charAt(i);
		    	tempString = ch + tempString;
		    	if (inputString.toLowerCase().equals(tempString.toLowerCase()))
		    		System.out.println("yes ");
		    	else 
		    		System.out.println("no ");		
			}   
	}
}

	/*public static boolean isPalindrome(String inputString) {
		 String tempString = "";
		  char ch;
		for( int i = 0; i < inputString.length(); i++) {
	    	ch = inputString.charAt(i);
	    	tempString = ch + tempString;
	    	if (inputString.toLowerCase().equals(tempString.toLowerCase()))
	    		return true;
	    	else 
	    		return false;
	    }
		return false;
	*/

