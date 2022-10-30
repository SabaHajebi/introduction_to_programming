import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What you want to do: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Power");
		int userChoice = input.nextInt();
		switch (userChoice){
		case 1:
			System.out.println("enter first number: ");
			int num1 = input.nextInt();
			System.out.println("enter second number: ");
			int num2 = input.nextInt();
			System.out.print(add(num1, num2));
			break;
			
		case 2:
			System.out.println("enter first number: ");
			int num3 = input.nextInt();
			System.out.println("enter second number: ");
			int num4 = input.nextInt();
			System.out.print(subtract(num3, num4));
			break;
			
		case 3:
			System.out.println("enter first number: ");
			int num5 = input.nextInt();
			System.out.println("enter second number: ");
			int num6 = input.nextInt();
			System.out.print(mul(num5, num6));
			break;
			
		case 4:
			System.out.println("enter first number: ");
			int num7 = input.nextInt();
			System.out.println("enter second number: ");
			int num8 = input.nextInt();
			System.out.print(div(num7, num8));
			break;
						
		case 5:
			System.out.println("What is the base?");
			int x = input.nextInt();
			System.out.println("What is exponent?");
			int n = input.nextInt();
			System.out.print(computePower(x, n));
			break;
		}
		
	
	}
	
	public static int div(int x, int n) {
		return x / n;
	}
	
	public static int add(int x, int n) {
		return x + n;
	}
	
	public static int mul(int x, int n) {
		return x * n;
	}
	
	public static int subtract(int x, int n) {
		return x - n;
	}

	public static int computePower(int x, int n) {
		 int result = 0;
		return result = (int) Math.pow(x, n);

	}
}
