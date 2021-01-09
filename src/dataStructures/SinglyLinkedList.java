package dataStructures;
/*
 * Add / Delete operations done in O(1) if at the head
 * 
 */
public class SinglyLinkedList {

	private Node head;
	private int size = 0;
	
	// ADD OBJECT TO FRONT OF LIST METHOD
	public void addToFront(TestObject obj) {
		Node newNode = new Node(obj);
		
		newNode.setNext(head); // current head becomes newNodes next
		head = newNode; // move head pointer to newNode
		size++;
	}
	
	// REMOVE OBJECT FROM FRONT OF LIST METHOD
	public Node removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		Node removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null); // cleanup 
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
		
		while(current != null) {
			
			System.out.println(current.toString());
			current = current.getNext();
		}
	}
}
