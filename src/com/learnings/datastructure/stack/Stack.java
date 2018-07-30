package com.learnings.datastructure.stack;

/**
 * 
 * @author Madanraj Venkatesan
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
			throw new StackIndexOutOfBoundsException("The Stack is Full.");
		}
		else {
			currentIndex++;
			System.out.println("Pushing " + element + " to Stack.");
			data[currentIndex] = element;
		}
	}
	
	public boolean isFull() {
		return this.currentIndex == this.size - 1;
	}

	public Object pop() {
		
		Object elementValue;
		
		if(isEmpty()) {
			throw new StackIndexOutOfBoundsException("The Stack is Empty.");
		}
		else {
			elementValue = this.data[this.currentIndex];
			System.out.println("Popping " + elementValue + " from the Stack.");
			currentIndex--;
		}
		return elementValue;
	}
	
	public Object peek() {
		
		Object elementValue;
		
		if(isEmpty()) {
			throw new StackIndexOutOfBoundsException("The Stack is Empty.");
		}
		else {
			elementValue = this.data[this.currentIndex];
			System.out.println("Stack Peek  " + elementValue);
		}
		return elementValue;
	} 
	
	public boolean isEmpty() {
		return this.currentIndex == -1;
	}
}