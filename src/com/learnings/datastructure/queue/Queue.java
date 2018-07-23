package com.learnings.datastructure.queue;

/**
 * 
 * @author Madanraj Venkatesan
 */
public class Queue {
	
	private int size;
	private Object [] data;
	private int currentPushIndex;
	private int currentPopIndex;

	/**
	 * <p>
	 * 		Queue Constructor
	 * 
	 * @param size
	 */
	public Queue(int size) {
		this.size = size;
		this.data = new Object[size];
		this.currentPushIndex = -1;
		this.currentPopIndex = -1;
	}
	
	/**
	 * <p>
	 * 		This method is to Add new elements to the Queue.
	 * 
	 * @param element - element.
	 */
	public void enqueue(Object element) {
		if(isFull()) {
			throw new QueueIndexOutOfBoundsException("The Queue is Full");
		}
		else {
			currentPushIndex++;
			data[currentPushIndex] = element;
		}
	}
	
	/**
	 * <p>
	 * 		This method is to get the existing elements from the Queue.
	 * 
	 * @return Object - Current Queue Item
	 */
	public Object dequeue() {
		if(isEmpty()) {
			throw new QueueIndexOutOfBoundsException("The Queue is Empty");
		}
		else {
			currentPopIndex++;
			return data[currentPopIndex];
		}
	}

	/**
	 * <p>
	 * 		Returns whether the Queue is empty or not.
	 * 
	 * @return isEmpty
	 */
	public boolean isEmpty() {
		return this.currentPopIndex == currentPushIndex;
	}

	/**
	 * <p>
	 * 		Returns whether the Queue is full or not.
	 * 
	 * @return isFull
	 */
	public boolean isFull() {
		return this.currentPushIndex == size - 1;
	}
}

