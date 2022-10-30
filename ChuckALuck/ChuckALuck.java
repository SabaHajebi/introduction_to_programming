
/*1. ResolveBet
I have correctly defined ResolveBet which takes the bet type (String) and the Wallet object, and a void return type [Mark out of 7: 7 ].
Comment:
My program presents the amount of cash in the wallet and asks the user how much he/she would like to bet [Mark out of 8: 8].
Comment:My program presents the amount of cash in the wallet and asks the user how much he/she would like to bet
My program ensures the bet amount is not greater than the cash in the wallet [Mark out of 5: 5].
Comment: My program ensures the bet amount is not greater than the cash in the wallet
My program creates three Dice objects, rolls them and creates a total variable with a summation of the roll values returned [Mark out of 15: 15 ]..
Comment:My program creates three Dice objects, rolls them and creates a total variable with a summation of the roll values returned
My program determines the winnings by comparing the bet type with the total and comparing the bet type with the dice faces for the triple bet [Mark out of 20:20 ].
Comment:My program determines the winnings by comparing the bet type with the total and comparing the bet type with the dice faces for the triple bet
My program outputs the results (win or loss) and adds the winnings to the wallet if user wins or removes the bet amount from the wallet if the user loses [Mark out of 10: 10 ].
Comment:My program outputs the results (win or loss) and adds the winnings to the wallet if user wins or removes the bet amount from the wallet if the user loses

2. Main
I ask the user for the amount of cash he/she has, create a Wallet object and put this cash into it [Mark out of 15:15 ]
Comment:I ask the user for the amount of cash he/she has, create a Wallet object and put this cash into it
My program loops continuously until the user either enters quit or the cash in the wallet is 0 [Mark out of 5: 5]
Comment: My program loops continuously until the user either enters quit or the cash in the wallet is 0
I ask the user to enter any of the four bet types or quit [Mark out of 5: 5].
Comment:I ask the user to enter any of the four bet types or quit
My program calls resolveBet for each bet type entered [Mark out of 5:5 ].
Comment:My program calls resolveBet for each bet type entered
At the end of the game my program presents a summary message regarding winnings and losses [Mark out of 5: 5 ]
Comment:At the end of the game my program presents a summary message regarding winnings and losses 
Total Mark out of 100 (Add all the previous marks): 100

*/


import java.util.Scanner;

public class ChuckALuck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double initialCash = 0;
		Wallet wallet = new Wallet();

		System.out.print("Please enter the amount of cash you have: ");
		if (input.hasNextDouble()) 
		{
			initialCash = input.nextDouble();
			wallet.put(initialCash);
		}

		boolean finish = false;
		while (!finish) 
		{
			System.out.println("Place your bet or enter 'quit'. \n'Triple'\n'Field'\n'High'\n'Low'  ");		
			if (input.hasNext()) 
			{
				String playerChoice = input.next();

				if (playerChoice.equalsIgnoreCase("quit")) 
					finish = true;

				else if (playerChoice.equalsIgnoreCase("Triple") || 
						playerChoice.equalsIgnoreCase("Field") || 
						playerChoice.equalsIgnoreCase("High") || 
						playerChoice.equalsIgnoreCase("Low")) 
					resolveBet(playerChoice,  wallet);	
			}
			if (wallet.check() == 0) {
				System.out.println("You initially had $ " + initialCash + " and now you have $" + wallet.check());
			finish = true;
			}
		}
		input.close();
	
	}

	public static void resolveBet(String betType, Wallet wallet) {
		Scanner input = new Scanner(System.in);

		System.out.println("You have " + "$" + wallet.check() + " in your wallet.");
		System.out.println("How much money would you like to bet?");
		double betAmount = input.nextDouble();

		if (betAmount > wallet.check()) 
			System.out.println("You don't have enough money for that bet.");
		else {
			Dice dice1 = new Dice(6);
			Dice dice2 = new Dice(6);
			Dice dice3 = new Dice(6);
			dice1.roll();
			dice2.roll();
			dice3.roll();

			int rollTotal = dice1.topFace() + dice2.topFace() + dice3.topFace();

			switch (betType) 
			{
			case ("Triple"):
				if ((dice1.topFace() == dice2.topFace()) && (dice2.topFace() == dice3.topFace()) && (dice1.topFace() != 1 && dice1.topFace() != 6)) 
				{
					System.out.println("Congrats! You win!");
					wallet.put(30 * betAmount);
				}
				else 
				{
					System.out.println("Aw, better luck next time!");
					wallet.get(betAmount);
				}
			break;
			case "Field":
				if ((rollTotal < 8) || (rollTotal > 12)) 
				{
					System.out.println("Congrats! You win!");
					wallet.put(betAmount);
				} 
				else 
				{
					System.out.println("Aw, better luck next time!");
					wallet.get(betAmount);
				}
				break;

			case "High":
				if ((rollTotal > 10) && ((dice1.topFace() != dice2.topFace() || dice2.topFace() != dice3.topFace() || dice3.topFace() != dice1.topFace()) && (rollTotal != 12 && rollTotal != 15 && rollTotal != 18)))
				{
					System.out.println("Congrats! You win!");
					wallet.put(betAmount);
				} 
				else 
				{
					System.out.println("Aw, better luck next time!");
					wallet.get(betAmount);
				}
				break;
			case "Low":
				if ((rollTotal < 11) && (rollTotal != 3 && rollTotal != 6 && rollTotal != 9)) 
				{
					System.out.println("Congrats! You win!");
					wallet.put(betAmount);
				}
				else 
				{
					System.out.println("Aw, better luck next time!");
					wallet.get(betAmount);
				}
				break;

			default:
				System.out.println("Invalid input");
			}	

		}
	}
}


/*import textio.TextIO;

/**
 * This program creates, administers, and grades a quiz made up of ten questions,
 * where each question has an integer answer.  The quiz includes some simple addition
 * problems, some subtraction problems, and some non-math questions.
 
public class GeneralQuiz {

    // -------------------- Nested classes and interface -----------------------

    interface IntQuestion {
        public String getQuestion();
        public int getCorrectAnswer();
    }
    
    static class AdditionQuestion implements IntQuestion {
       private int a, b;  // The numbers in the problem.
       public AdditionQuestion() { // constructor
           a = (int)(Math.random() * 50 + 1);
           b = (int)(Math.random() * 50);
       }
       public String getQuestion() {
           return "What is " + a + " + " + b + " ?";
       }
       public int getCorrectAnswer() {
           return a + b;
       }
    }

    static class SubtractionQuestion implements IntQuestion {
       private int a, b;  // The numbers in the problem.
       public SubtractionQuestion() { // constructor
           a = (int)(Math.random() * 50 + 1);
           b = (int)(Math.random() * 50);
           if (b > a) { // swap a and b so answer won't be negative
              int temp = a;
              a = b;
              b = temp;
           }
       }
       public String getQuestion() {
           return "What is " + a + " - " + b + " ?";
       }
       public int getCorrectAnswer() {
           return a - b;
       }
    }
    
    // -------------------- The Program --------------------------------------

    private static IntQuestion[] questions;  // The questions for the quiz

    private static int[] userAnswers;   // The user's answers to the ten questions.
    
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the quiz");
        System.out.println();
        System.out.println("There are some math questions and a few non-math");
        System.out.println("questions, but the answer to every question is");
        System.out.println("an integer.");
        System.out.println();
        createQuiz();
        administerQuiz();
        gradeQuiz();
    }
    
    
    /**
     * Creates the array of objects that holds the quiz questions
     
    private static void createQuiz() {
        questions = new IntQuestion[10];
        for ( int i = 0; i < 7; i++ ) {
            if (Math.random() < 0.5)
	            questions[i] = new AdditionQuestion();
	        else
	            questions[i] = new SubtractionQuestion();
        }
        questions[7] = new IntQuestion() {
              public String getQuestion() {
                  return "How many states are there in the United States?";
              }
              public int getCorrectAnswer() {
                  return 50;
              }
        };
        questions[8] = new IntQuestion() {
              public String getQuestion() {
                  return "In what year did the First World War begin?";
              }
              public int getCorrectAnswer() {
                  return 1914;
              }
        };
        questions[9] = new IntQuestion() {
              public String getQuestion() {
                  return "What is the answer to the ultimate question " +
                                "of life, the universe, and everything?";
              }
              public int getCorrectAnswer() {
                  return 42;
              }
        };
   }        
    
    
    /**
     * Asks the user each of the ten quiz questions and gets the user's answers.
     * The answers are stored in an array, which is created in this subroutine.
     
    private static void administerQuiz() {
        userAnswers = new int[10];
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            System.out.printf("Question %2d:  %s ",
                                  questionNum, questions[i].getQuestion());
            userAnswers[i] = TextIO.getlnInt();
        }
    }
    
    
    /**
     * Shows all the questions, with their correct answers, and computes a grade
     * for the quiz.  For each question, the user is told whether they got
     * it right.
     
    private static void gradeQuiz() {
        System.out.println();
        System.out.println("Here are the correct answers:");
        System.out.println();
        int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 10; i++) {
            System.out.println("Question number " + (i+1) + ":");
            System.out.println("    " + questions[i].getQuestion());
            System.out.println("    Correct answer:  " + questions[i].getCorrectAnswer());
            if ( userAnswers[i] == questions[i].getCorrectAnswer() ) {
                System.out.println("    You were CORRECT.");
                numberCorrect++;
            }
            else {
                System.out.println("    You said " + userAnswers[i] + ", which is INCORRECT.");
            }
            System.out.println();
        }
        grade = numberCorrect * 10;
        System.out.println();
        System.out.println("You got " + numberCorrect + " questions correct.");
        System.out.println("Your grade on the quiz is " + grade);
        System.out.println();
    }

} // end class GeneralQuiz

*/


