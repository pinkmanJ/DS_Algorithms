package dataStructures;

/*
 * Abstract data structure
 * A stack simply dictates the operations that can be done, it's not a concrete data structure like array or list
 * This is an array implementation
 */

public class ArrayStack {

	TestObject[] stack;
	int top = 0;
	
	// CREATE STACK CONSTRUCTOR
	public ArrayStack(int size) {
		this.stack = new TestObject[size];
	}
	
	// PUSH METHOD
	public void push(TestObject val) {
		
		if(top == stack.length) {
			//resize array
			TestObject[] newArray = new TestObject[stack.length * 2];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		
		stack[top++] = val;
	}
	
	// POP METHOD
	public TestObject pop() {
		
		if (isEmpty()) {
			return null;
		}

		TestObject removedVal = stack[--top];

		return removedVal;
	}
	
	// PEEK METHOD
	public TestObject peek() {

		if (isEmpty()) {
			return null;
		}

		TestObject peekVal = stack[top - 1];

		return peekVal;
	}
	
	// IS EMPTY METHOD
	public boolean isEmpty() {
		return top == 0;
	}
	
	// SIZE METHOD
	public int size() {
		return top;
	}
	
	// PRINT STACK METHOD
	public void printStack() {
		for(int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}