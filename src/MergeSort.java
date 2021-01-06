/*
 * MERGE SORT ANALYSIS
 * NOT an in-place algorithm, temporary arrays will be used
 * BIG O(nlogn) base 2
 * Stable 
 */
public class MergeSort {

	// MERGE SORT METHOD
	public static void mergeSort(int[] inputArr, int start, int end) {

		// base case, the input array has been split into single array partitions
		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;
		mergeSort(inputArr, start, mid);
		mergeSort(inputArr, mid, end);
		merge(inputArr, start, mid, end);
	}
	
	public static void descendingMergeSort(int[] inputArr, int start, int end) {
		
		// base case, the input array has been split into single array partitions
		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;
		descendingMergeSort(inputArr, start, mid);
		descendingMergeSort(inputArr, mid, end);
		descendingMerge(inputArr, start, mid, end);
	}

	// MERGE METHOD
	public static void merge(int[] inputArr, int start, int mid, int end) {

		// optimization, remember the left and right arrays are sorted at this point, so
		// if the last
		// element in the left array is less than or equal to the first element in the
		// right array, we
		// know that when we combine sides they will remain sorted
		if (inputArr[mid - 1] <= inputArr[mid]) {
			return;
		}

		int i = start;
		int j = mid;
		int tempIndex = 0;

		int[] tempArr = new int[end - start];

		while (i < mid && j < end) {
			tempArr[tempIndex++] = inputArr[i] <= inputArr[j] ? inputArr[i++] : inputArr[j++];
		}

		// optimization
		System.arraycopy(inputArr, i, inputArr, start + tempIndex, mid - i);
		System.arraycopy(tempArr, 0, inputArr, start, tempIndex);
	}
	
	public static void descendingMerge(int[] inputArr, int start, int mid, int end) {
		
		if (inputArr[mid - 1] >= inputArr[mid]) {
			return;
		}

		int i = start;
		int j = mid;
		int tempIndex = 0;

		int[] tempArr = new int[end - start];

		while (i < mid && j < end) {
			tempArr[tempIndex++] = inputArr[i] >= inputArr[j] ? inputArr[i++] : inputArr[j++];
		}

		// optimization
		System.arraycopy(inputArr, i, inputArr, start + tempIndex, mid - i);
		System.arraycopy(tempArr, 0, inputArr, start, tempIndex);
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
		System.out.println("Unsorted");
		populateArray(testArray);
		printArray(testArray);
		System.out.println();

		// sorted array
		mergeSort(testArray, 0, testArray.length);
		System.out.println("Ascending");
		printArray(testArray);
		System.out.println();
		
		descendingMergeSort(testArray, 0, testArray.length);
		System.out.println("Descending");
		printArray(testArray);
	}
}
