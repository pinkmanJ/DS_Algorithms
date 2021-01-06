
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
	
	public static void recursiveInsertionSort(int[] inputArr, int numItems) {
		
		if(numItems < 2) {
			return;
		}
		
		recursiveInsertionSort(inputArr, numItems - 1);
		
	
			int newElement = inputArr[numItems - 1]; // value of the first unsorted index

			int i;

			for (i = numItems - 1; i > 0 && inputArr[i - 1] > newElement; i--) {
				inputArr[i] = inputArr[i - 1];
			}

			inputArr[i] = newElement;
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
		
		// test arrays
		int[] testArray = new int[10];
		int[] testArray2 = new int[10];

		System.out.println("ITERATIVE INSERTION SORT");
		populateArray(testArray);
		printArray(testArray);
		System.out.println();

		// iterative insertion sort
		insertionSort(testArray);
		printArray(testArray);
		System.out.println("\n");
		
		System.out.println("RECURSIVE INSERTION SORT");
		populateArray(testArray2);
		printArray(testArray2);
		System.out.println();
		
		// recursive insertion sort
		recursiveInsertionSort(testArray2, 10);
		printArray(testArray2);
	}

}
