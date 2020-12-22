
public class BubbleSort {
	
	/* BUBBLE SORT ANALYSIS
	 * In-place algorithm, meaning no new arrays need be created
	 * If the memory remains the same based on the number of items to be sorted it's considered in-place
	 * O(n^2) time complexity - quadratic - slow
	 * */
	
	//SWAP METHOD
	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;	
	}
	
	//BUBBLESORT METHOD
	public static void bubbleSort(int[] array) {
		
		for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			for(int i = 0; i < lastUnsortedIndex; i++) {
				if(array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}	
	}
	
	//POPULATE ARRAY METHOD
	public static void populateArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * (10 - 1 + 1)) + 1);
		}
	}
	
	//PRINT ARRAY METHOD
	public static void printArray(int[] array) {
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		
		int[] testArray = new int[10];
		
		//unsorted array
		populateArray(testArray);
		printArray(testArray);
		
		System.out.println();
		
		//sorted array
		bubbleSort(testArray);
		printArray(testArray);
		
		
		
		

	}

}
