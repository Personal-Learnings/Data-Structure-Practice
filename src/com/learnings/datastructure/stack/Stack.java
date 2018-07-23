package com.learnings.datastructure.stack;

/**
 * 
 * @author Madanraj Venkatesan
 *
 */
public class Stack {
	
	private int size;
	private Object [] data;
	private int currentIndex;
	
	public Stack(int size) {
		this.size = size;
		this.data = new Object[this.size];
		this.currentIndex = -1;
	}
	
	public void push(Object element) {

		if(isFull()) {
			throw new StackIndexOutOfBoundsException("The Stack is Full");
		}
		else {
			currentIndex++;
			data[currentIndex] = element;
		}
	}
	
	public boolean isFull() {
		return this.currentIndex == this.size-1;
	}

	public Object pop() {
		if(isEmpty()) {
			throw new StackIndexOutOfBoundsException("The Stack is Empty");
		}
		else {
			int tempIndex = currentIndex;
			currentIndex--;
			return this.data[tempIndex];
		}
	}
	
	public boolean isEmpty() {
		return this.currentIndex == -1;
	}
}