import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
	int result = 0;
	int n = 0;
	for (int count = 0; (count < 7); count += 2) {
		result += count * count;
		n++;
		}
	System.out.println(result); 
	System.out.println(n); 
	
	}
}
