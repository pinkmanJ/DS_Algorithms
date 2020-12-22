
public class BasicArrayInfo {

	public static void main(String[] args) {
		
		int[] intArray = new int[7]; //cannot change size once created
		int [] tempArray; //declared array, not initialized 
		
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		
		//STANDARD FOR LOOP
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		//FOR EACH LOOP
		for(int j : intArray) {
			System.out.println(j);
		}
		
		/*BIG O ANALYSIS OF ARRAYS
		* If the index is known, O(1) time complexity
		* Because of x + (i * y)
		* x = starting memory address
		* i = index
		* y = size of value (4 bytes for int)
		* 3 steps in an equation, regardless of size of array N
		*
		* If the index is unknown, O(N) time complexity
		* This is because we have to potentially search the entire array until we find our value
		*/
	}

}
