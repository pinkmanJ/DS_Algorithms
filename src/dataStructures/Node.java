package dataStructures;

public class Node {
	
	private TestObject testObject;
	private Node next;
	private Node previous;
	
	// CONSTRUCTOR
	public Node(TestObject testObject) {
		this.testObject = testObject;
	}

	// GET AND SET METHODS
	public TestObject getTestObject() {
		return testObject;
	}

	public void setTestObject(TestObject testObject) {
		this.testObject = testObject;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
	// TO STRING METHOD
	public String toString() {
		return testObject.toString();
	}
}
