package com.learnings.datastructure.stack;

public class Stack {
	
	private int size;
	private Object [] stackData;
	private int currentIndex;
	
	public Stack(int size) {
		this.size = size;
		this.stackData = new Object[this.size];
		this.currentIndex = -1;
	}
	
	public void push(Object element) {

		if(isStackFull()) {
			throw new StackFullException("The Stack is Full");
		}
		else {
			currentIndex++;
			stackData[currentIndex] = element;
		}
	}
	
	public boolean isStackFull() {
		return this.currentIndex == this.size-1;
	}

	public Object pop() {
		if(isStackEmpty()) {
			throw new StackFullException("The Stack is Empty");
		}
		else {
			int tempIndex = currentIndex;
			currentIndex--;
			return this.stackData[tempIndex];
		}
	}
	
	public boolean isStackEmpty() {
		return this.currentIndex == -1;
	}
}