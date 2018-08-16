package com.learnings.datastructure.heap;

public class MaxHeap {
	
	private int [] data;
	
	private int size;
	
	private int currentIndex;
	
	private int capacity;
	
	public MaxHeap(int capacity) {
		this.capacity = capacity;
		this.data = new int[capacity];
		this.size = 0;
		this.currentIndex = -1;
	}
	
	public void insert(int value) {
		
		if(!isHeapFull()) {
			++size;
			++currentIndex;
			data[currentIndex] = value;
		}
		if(currentIndex != 1) {
			checkParentAndSwap();
		}
	}

	public void delete(int value) {
		
	}
	
	private void checkParentAndSwap() {
		
		for(int parentIndex = getParentIndex(currentIndex); parentIndex >= 0;) {
			if(data[parentIndex] < data[currentIndex]) {

				int temp = data[parentIndex];
				data[parentIndex] = data[currentIndex];
				data[currentIndex] = temp;
				
				parentIndex = getParentIndex(parentIndex);
			}
			else {
				break;
			}
		}
	}
	
	public boolean isHeapEmpty() {
		return size == 0;
	}
	
	public boolean isHeapFull() {
		return size == capacity;
	}
	
	public String viewHeap() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		
		for(int i = 0; i < this.size; i++) {
			builder.append(data[i] + " ");
		}
		builder.append(" ]");
		return builder.toString();
	}
	
	private int getParentIndex(int currentIndex) {
		return ((currentIndex - 1)/2);
	}
}