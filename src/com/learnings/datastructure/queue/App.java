package com.learnings.datastructure.queue;

public class App {
	
	public static void main(String[] args) {
		Queue queue = new Queue(3);
		queue.enqueue("First");
		queue.enqueue("Second");
		queue.enqueue("Third");

		
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}
}