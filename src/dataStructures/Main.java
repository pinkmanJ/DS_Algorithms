package dataStructures;

/*
 * Main class to run tests in
 */
public class Main {

	public static void main(String[] args) {
		
		TestObject test1 = new TestObject(5, 6);
		TestObject test2 = new TestObject(5, 5);
		TestObject test3 = new TestObject(7, 8);
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addToFront(test1);
		list.addToFront(test2);
		list.addToFront(test3);
		
		list.printList();

	}

}
