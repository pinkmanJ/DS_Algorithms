
public class SelectionSort {

	/*
	 * Selection sort analysis In-place algorithm O(n^2) time complexity Requires
	 * less swaps than Bubble Sort, performs better in the average case
	 */

	// SWAP METHOD
	public static void swap(int[] array, int i, int j) {

		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	// SELECTION SORT METHOD
	public static void selectionSort(int[] array) {

		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			int largest = 0;
			
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (array[i] > array[largest]) {
					largest = i;
				}
			}
			swap(array, lastUnsortedIndex, largest);
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
		selectionSort(testArray);
		printArray(testArray);

	}

}
