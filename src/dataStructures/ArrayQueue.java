package dataStructures;

import java.util.NoSuchElementException;

/*
 * Simple queue implementation backed by an array
 * Queue is an abstract data type that uses FIFO for add/remove operations  
 * O(1) for operations enqueue, dequeue, peek
 * 
 * Example visual 
 * (dequeue) front --> 6 8 5 3 8 5 3 4 <-- back (enqueue)
 */

public class ArrayQueue {

	private TestObject[] queue;
	private int front = 0;
	private int back = 0;
	int size = 0;

	// CONSTRUCTOR
	public ArrayQueue(int capacity) {
		this.queue = new TestObject[capacity];
	}

	// ENQUEUE METHOD
	public void enqueue(TestObject obj) {

		// check for resize
		if (back == queue.length) {
			TestObject[] newArray = new TestObject[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length); // copy old queue elements to new array
			queue = newArray; // assign queue to new resized array
		}
		queue[back] = obj; // assign new element to back of queue
		back++;
	}

	// DEQUEUE METHOD
	public TestObject dequeue() {

		if (size() == 0) {
			throw new NoSuchElementException();
		}

		TestObject removedElement = queue[front]; // create object to hold removed element
		queue[front] = null; // set front pointer to null
		front++;

		// if were removing the last element in the queue we can reset the pointers
		if (size() == 0) {
			front = 0;
			back = 0;
		}
		return removedElement;
	}

	// PEEK METHOD
	public TestObject peek() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}

	// SIZE METHOD
	public int size() {
		return back - front;
	}

	// PRINT QUEUE METHOD
	public void printQueue() {
		if (size() == 0) {
			System.out.println("Queue is Empty");
		} else {
			for (int i = front; i < back; i++) {
				System.out.println(queue[i]);
			}
		}
	}
}