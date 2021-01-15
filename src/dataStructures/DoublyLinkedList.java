package dataStructures;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	int size = 0;
	
	// ADD TO FRONT METHOD
	public void addToFront(TestObject obj) {
		
		Node newNode = new Node(obj);
		
		// empty list case
		if (head == null) {
			tail = newNode;
		} else {
			newNode.setNext(head); // new nodes next points to current head
			head.setPrevious(newNode); // current heads previous points to new node
		}

		head = newNode; // move head pointer to newNode
		size++;
	}

	// REMOVE FROM FRONT METHOD
	public Node removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		Node removedNode = head;

		// only 1 node in list case
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}

		head = head.getNext();
		size--;
		removedNode.setNext(null); // cleanup
		return removedNode;
	}
	
	// ADD TO END METHOD
	public void addToEnd(TestObject obj) {
		
		Node newNode = new Node(obj);
		
		// empty list case
		if(tail == null) {
			head = newNode;
		} else {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
		}
		
		tail = newNode;
		size++;
	}
	
	// REMOVE FROM END METHOD
	public Node removeFromEnd() {
		if(isEmpty()) {
			return null;
		}
		
		Node removedNode = tail;
		
		//only 1 node in list case
		if(tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		
		tail = tail.getPrevious();
		size--;
		removedNode.setPrevious(null); // cleanup
		return removedNode;
	}

	// GET SIZE METHOD
	public int getSize() {
		return size;
	}

	// IS EMPTY METHOD
	public boolean isEmpty() {
		return head == null;
	}

	// PRINT LIST METHOD
	public void printList() {

		Node current = head;

		while (current != null) {

			System.out.println(current.toString());
			current = current.getNext();
		}
	}
}
