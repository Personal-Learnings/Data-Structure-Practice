package com.learnings.datastructure.queue;

/**
 * 
 * @author Madanraj Venkatesan
 */
public class Queue {
	
	private int size;
	private Object [] data;
	private int headIndex;
	private int rearIndex;

	public Queue(int size) {
		this.size = size;
		this.data = new Object[size];
		this.headIndex = -1;
		this.rearIndex = -1;
	}
	
	public void enqueue(Object element) {
		if(isFull()) {
			throw new QueueIndexOutOfBoundsException("The Queue is Full.");
		}
		else {
			headIndex++;
			data[headIndex] = element;
		}
	}
	
	public Object dequeue() {
		if(isEmpty()) {
			throw new QueueIndexOutOfBoundsException("The Queue is Empty.");
		}
		else {
			rearIndex++;
			return data[rearIndex];
		}
	}
	
	public Object peek() {
		
		return null;
		
	}

	public boolean isEmpty() {
		return this.rearIndex == headIndex;
	}

	public boolean isFull() {
		return this.headIndex == size - 1;
	}
}