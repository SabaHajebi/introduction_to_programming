import java.text.DecimalFormat;
import java.util.Scanner;

public class WizardCurrency {
	public static Scanner input = new Scanner(System.in);
	public static int pounds = 0;
	public static int pence = 0;
	public static double poundToKnutsConversionRate = 162.725;
	public static double knutsToPenceConversionRate = 1.62725;	

	public static void main(String[] args) {	
		int numGalleons = 0;
		int numSickles = 0;
		int numKnuts = 0;
		boolean flagOkay = false;
		int number = 0;
		String errorMessage = "Error: Invalid selection.";

		try
		{
			System.out.print( "1. Convert Wizarding Currency To GBP\r\n"
					+ "2. Convert Knuts To Wizarding Currency and GBP\r\n"
					+ "3. Convert GBP to Wizarding Currency\r\n"
					+ "4. Quit\r\n"
					+ "Select function> ");
			number = input.nextInt();

			if (number < 1 || number > 4)
				System.out.println(errorMessage);
			else 
				flagOkay = true;

			switch (number)
			{
			case 1:
				numGalleons = (int) Math.round(getNumberFromUser("Enter the number of Galleons > ", 
						"Error: The number of Galleons should be an integer (e.g. 3)", 
						input, true));
				numSickles = (int) Math.round(getNumberFromUser("Enter the number of Sickles > ", 
						"Error: The number of Sickles should be an integer (e.g. 5)", 
						input, true));
				numKnuts = (int) Math.round(getNumberFromUser("Enter the number of Knuts > ", 
						"Error: The number of Knuts should be an integer (e.g. 12)", 
						input, true));
				pence = convertWizardingCurrencyToPence( numGalleons,  numSickles,  numKnuts);
				double numPounds2 = pence * 1.0 / 100;
				DecimalFormat df = new DecimalFormat("###.##");
				System.out.printf("In British Pounds HP" + numGalleons + ":" + numSickles + ":" + numKnuts + " is GBP" + df.format(numPounds2));
				break;
				
			case 2: 
				String errorMessageKnuts = "Error: The number of Knuts should be an integer (e.g. 56)";
				String promptKnuts = "Enter the number of Knuts > ";
				numKnuts = (int) getNumberFromUser(promptKnuts, errorMessageKnuts, input, true);
				pence = convertWizardingCurrencyToPence(numGalleons, numSickles, numKnuts);
				String wizardCurrency2 = convertKnutsToWizardingCurrency(numKnuts);
				double numPounds = pence * 1.0 / 100;
				DecimalFormat df2 = new DecimalFormat("###.##");
				System.out.println((numKnuts + " knuts is " + wizardCurrency2 + " is equal to GBP") + df2.format(numPounds));
				break;
				
			case 3: 
				String errorMessagePounds = "Error: Invalid number of British pounds and pence";
				String promptPounds = "Enter the number of British pounds and pence (e.g. 1.24) > ";
				double poundsAndPence = getNumberFromUser(promptPounds, errorMessagePounds, input, false);		
				int numPound = (int) Math.round(poundsAndPence);
				int numPence = (int) ((poundsAndPence - numPound) * 100);
				String wizardCurrency = convertGBPToWizardingCurrency(numPound, numPence); 
				System.out.println("In wizarding currency GBP" + poundsAndPence + " is " + wizardCurrency);
				break;
			case 4:
				break;
			} 
		}

		catch (Exception e) {
			System.out.print(errorMessage);
			input.close();
		}

	}


	public static double getNumberFromUser(String prompt, String errorMessage, Scanner input, boolean integerRequired)
	{
		double number = 0.0; 
		boolean flagReadOkay = false;
		do 
		{
			System.out.print(prompt);
			if (integerRequired) 
			{
				try 
				{
					number = input.nextInt();
				}
				catch (Exception e) 
				{
					System.out.println(errorMessage);
					input.next();
					continue;
				}
				if (number < 1)
					System.out.println(errorMessage);
				else
					flagReadOkay = true;	
			}
			else // !integerRequired
			{
				try 
				{
					number = input.nextDouble();
				}
				catch (Exception e)
				{
					System.out.println(errorMessage);
					input.next();
					continue;
				}
				if (number < 1.0)
					System.out.println(errorMessage);
				else
					flagReadOkay = true;	
			}

		} while (!flagReadOkay);

		return number;
	}
	public static int convertGBPToKnuts(int pounds, int pence) 
	{
		int numKnuts = 0;
		double poundsAndPence = pounds + (pence * 1.0) /100;
		numKnuts = (int) Math.round(poundsAndPence * poundToKnutsConversionRate);
		return numKnuts;
	}

	public static int convertWizardingCurrencyToPence(int numGalleons, int numSickles, int numKnuts)
	{	
		 numKnuts = convertWizardingCurrencyToKnuts(numGalleons, numSickles,  numKnuts); 
	     pence = (int) Math.round((numKnuts / knutsToPenceConversionRate)); 
	     return pence;
	}

	public static String convertKnutsToWizardingCurrency(int totalKnuts)
	{

		int numGalleons = (int) Math.floor(totalKnuts / 493); 
		int numSickles1 = (int) Math.floor((totalKnuts - (numGalleons * 493))); 
		int numSickles = (int) Math.floor(numSickles1 / 29);
		int numKnuts = (int) Math.floor(numSickles1 - (numSickles * 29));
		return "HP" + String.valueOf(numGalleons) + ":" + String.valueOf(numSickles) + ":" + String.valueOf(numKnuts);
	}

	public static int convertWizardingCurrencyToKnuts( int numGalleons, int numSickles, int numKnuts ) 
	{
		int tempNumKnuts1 = numGalleons * 493; 
		int tempNumKnuts2 = (numSickles * 29) + numGalleons;
		numKnuts = numKnuts + tempNumKnuts2 + tempNumKnuts1;
		return numKnuts;
	}

	public static String convertGBPToWizardingCurrency( int pounds, int pence ) 
	{
		int totalKnuts = convertGBPToKnuts(pounds,  pence); 
		String wizardCurrency = convertKnutsToWizardingCurrency(totalKnuts);
		return wizardCurrency;

	}


}
