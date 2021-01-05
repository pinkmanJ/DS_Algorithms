
public class CountingSort {
	
	public static void countingSort(int[] inputArr, int min, int max) {
		
		int[] countArr = new int[(max - min) + 1];
		
		// fill count array with respective values
		for(int i = 0; i < inputArr.length; i++) {
			countArr[inputArr[i] - min]++;
		}
		
		int j = 0;
		for(int i = min; i <= max; i++) {
			while(countArr[i - min] > 0) {
				inputArr[j++] = i;
				countArr[i - min]--;
			}		
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
		countingSort(testArray, 0, testArray.length);
		printArray(testArray);

	}

}
