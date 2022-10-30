import java.util.Scanner;
public class AdditionQuiz {
	
     static Scanner input = new Scanner(System.in);
	private static int[] num1;
	private static int[] num2;
	private static int[] userNum;
	
	public static void main(String[] args) {
		createQuiz();
		administerQuiz();
		gradeQuiz();
		

	}
	
	public static void createQuiz() {
		num1 = new int[10];
		num2 = new int[10];
		
		for (int i = 0; i < 10; i++)
		{
			num1[i] = (int)(Math.random() * 50 + 1);
			num1[i] = (int)(Math.random() * 50);
		}
		
	}
	
	public static void administerQuiz() {
		userNum = new int[10];
		for (int i = 0; i < 10; i++)
		{
			int questionNum = i + 1;
			System.out.printf("Question %2d: What is %2d + %2d ? ", questionNum, num1, num2);
			userNum[i] = input.nextInt();
		}
	}
	
	public static void gradeQuiz() {
		int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 10; i++)
        {
        	int questionNum = i + 1;
        	int correctAnswer = num1[i] + num2[i];
        	System.out.printf("   Question %2d:  %2d + %2d  =  %2d.  ",
                    questionNum, num1[i], num2[i], correctAnswer);
        	if (userNum[i] == correctAnswer) {
        		 System.out.println("You were CORRECT.");
        		 numberCorrect++;
        	}
        	else {
        		   System.out.println("You said " + userNum[i] + ", which is INCORRECT.");
        	}
        }
        grade = numberCorrect * 10;
        System.out.println("Your grade on the quiz is " + grade); 	
        }	
	

}
