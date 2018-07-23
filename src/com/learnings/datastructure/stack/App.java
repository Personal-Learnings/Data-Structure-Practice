package com.learnings.datastructure.stack;

public class App {
	
	public static void main(String[] args) throws StackFullException {
		Stack stack = new Stack(10);
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		
		while(!stack.isStackEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
