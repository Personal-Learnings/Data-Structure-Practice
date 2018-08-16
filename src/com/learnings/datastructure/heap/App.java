package com.learnings.datastructure.heap;

public class App {
	
	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap(10);
		heap.insert(10);
		heap.insert(9);
		heap.insert(8);
		heap.insert(7);
		heap.insert(6);
		heap.insert(5);
		heap.insert(4);
		heap.insert(3);
		heap.insert(20);
		System.out.println(heap.viewHeap());
	}
}
