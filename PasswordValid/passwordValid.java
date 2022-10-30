import java.util.Scanner;

public class passwordValid {
	
	public static final int LENGTH = 8;

	public static void main(String[] args) {
		System.out.print("1. A password must have at least eight characters.                                             \r\n"
				+ "2. A password consists of only letters and digits.                                         \r\n"
				+ "3. A password must contain at least two digits                                        \r\n"
				+ "Input a password > ");
		Scanner input = new Scanner( System.in );
		String s = input.nextLine();	
	

        if (isValidPassword(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }
	
	}
	
	static boolean isValidPassword(String password)
	{
		if (password.length() < LENGTH )
			return false;
		
		int charCount = 0;
		int numCount = 0;
		
		for (int i = 0; i < password.length(); i++)
		{
			char ch = password.charAt(i);
			if (is_Numeric(ch)) numCount++;
			else if (is_Letter(ch)) charCount++;
			else return false;
		}
		
		return (charCount >= 2 && numCount >= 2);
	}
	  public static boolean is_Letter(char ch) {
	        ch = Character.toUpperCase(ch);
	        return (ch >= 'A' && ch <= 'Z');
	    }


	    public static boolean is_Numeric(char ch) {

	        return (ch >= '0' && ch <= '9');
	    }	

}
