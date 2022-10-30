package eTest3Practice;

import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
	Scanner inputScanner = new Scanner(System.in);
	System.out.print("What is the radius of the circle?");
	double radius = inputScanner.nextInt();
	Circle circle = new Circle(radius);
	System.out.printf("Perimeter of the circle is %.2f ", circle.getPerimeter());
	System.out.printf("\nArea of the circle is %.2f ", circle.getArea());
	
	
	
			

	}

}
