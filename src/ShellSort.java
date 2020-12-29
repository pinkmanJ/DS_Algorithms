
public class ShellSort {
	
	/* SHELL SORT ANALYSIS
	 * Same as Insertion sort but with a larger gap value that decreases each iteration until it's 1
	 * When the gap value is 1 we have Insertion sort
	 * O(n^2) in the worst case, hard to nail down because it depends on the gap used
	 * however, it can perform much better than that because of the shift reduction
	 * In place algorithm
	 * Unstable algorithm
	 * Can also be applied to Bubble sort, reduces swaps
	 */
	
	// SHELL SORT METHOD
	public void shellSort(int[] array) {
		
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
		
	}
	
	

}
