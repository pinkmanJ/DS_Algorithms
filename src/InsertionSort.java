
public class InsertionSort {
	
	/* 
	 * Insertion sort analysis
	 * In-place algorithm
	 * O(n^2) - quadratic - slow
	 * Doesn't need swap helper method
	 */
	
	// INSERTION SORT METHOD
	public static void insertionSort(int[] array) {

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
			int newElement = array[firstUnsortedIndex]; // value of the first unsorted index
			
			int i;
			
			for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
				array[i] = array[i - 1];
			}
			
			array[i] = newElement;
		}
	}
	
	// POPULATE ARRAY METHOD
	public static void populateArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * (10 - 1 + 1)) + 1);
		}
	}

	// PRINT ARRAY METHOD
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		
		int[] testArray = new int[10];

		// unsorted array
		populateArray(testArray);
		printArray(testArray);

		System.out.println();

		// sorted array
		insertionSort(testArray);
		printArray(testArray);
	}

}
