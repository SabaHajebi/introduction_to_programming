
public class SumOfValues {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 5 , 4, 3, 6};
		int value = 11;
		boolean sumIsEqual = false;
		
		for(int i = 0; i < array.length - 1 ; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int sum = array[i] + array[j];
				if(sum == value) {
					sumIsEqual = true;
				System.out.print(sumIsEqual);
					}
				else {
					sumIsEqual = false;
					System.out.print(sumIsEqual);
				}
		
				
			}
		}

	}

}
