
public class Quicksort {

	public static void main(String[] args) {
		
		int[] array = {4, 9, 2, 0, 19, 735};
		int start = 0;
		int end = array.length - 1;
		
		System.out.print("original array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		quickSort(array, start, end);
		System.out.print("after sorting array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
	
	public static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot - 1);
			quickSort(array, pivot + 1, end);
		}
	}
	
	public static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start - 1;
		
		for(int j = start; j <= end - 1; j++) {
			if(array[j] < pivot ) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, end);
		return (i+1);
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	

}
