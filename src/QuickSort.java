/*
 * QUICK SORT ANALYSIS
 * Divide and conquer algorithm + recursive
 * In place algorithm
 * O(nlogn) base 2 on average, worst case is O(n^2) generally performs better than merge sort
 * Unstable
 * Good for when there are memory constraints or a large array is being used
 * With merge sort and a large array we have to create temp arrays constantly which is expensive
 */
public class QuickSort {

	// QUICK SORT METHOD
	public static void quickSort(int[] inputArr, int start, int end) {

		if (end - start < 2) {
			return;
		}
		
		int pivotIndex = partition(inputArr, start, end);
		quickSort(inputArr, start, pivotIndex);
		quickSort(inputArr, pivotIndex + 1, end);
	}

	public static int partition(int[] inputArr, int start, int end) {

		int pivot = inputArr[start];
		int i = start;
		int j = end;

		// if i is less than j that means they have crossed and we need to drop out of
		// the loop
		while (i < j) {

			while (i < j && inputArr[--j] >= pivot);
				if (i < j) {
					inputArr[i] = inputArr[j];
				}

			while (i < j && inputArr[++i] <= pivot);
				if (i < j) {
					inputArr[j] = inputArr[i];
				}
		}

		inputArr[j] = pivot;
		return j;
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
		quickSort(testArray, 0, testArray.length);
		printArray(testArray);

	}
}
