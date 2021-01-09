package dataStructures;

public class Node {
	
	private TestObject testObject;
	private Node next;
	
	// CONSTRUSTOR
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
	
	public String toString() {
		return testObject.toString();
	}
}
