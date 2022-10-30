import java.util.Scanner;

public class dayMonthYear {
	public static final int MAX_VALID_YEAR = 9999;
	public static final int MIN_VALID_YEAR = 1800;

	public static void main(String[] args) {
		
		boolean quit = true;
		while (!quit)
			System.out.print("Enter a date in the form dd-mm-yyyy > ");
		Scanner input = new Scanner(System.in); 
		String dayMonthYearString = input.nextLine();
		if(dayMonthYearString.length() == 0) 
			return;
		String[] dayMonthYearList = dayMonthYearString.split("-");
		quit = false;


	}

}
