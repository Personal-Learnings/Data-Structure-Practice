package com.learnings.datastructure.queue;

public class Queue {
	
	private int size;
	private Object [] data;
	private int currentPushIndex;
	private int currentPopIndex;

	
	public Queue(int size) {
		this.size = size;
		this.data = new Object[size];
		this.currentPushIndex = -1;
		this.currentPopIndex = -1;
	}
	
	public void enqueue(Object element) {
		if(isFull()) {
			throw new QueueIndexOutOfBoundsException("The Queue is Full");
		}
		else {
			currentPushIndex++;
			data[currentPushIndex] = element;
		}
	}
	
	public Object dequeue() {
		if(isEmpty()) {
			throw new QueueIndexOutOfBoundsException("The Queue is Empty");
		}
		else {
			currentPopIndex++;
			return data[currentPopIndex];
		}
	}

	public boolean isEmpty() {
		return this.currentPopIndex == currentPushIndex;
	}

	public boolean isFull() {
		return this.currentPushIndex == size - 1;
	}
}