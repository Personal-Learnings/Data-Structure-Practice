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
		
		System.out.println(reverseString("nasetakneV jarnadaM"));
	}
	
	private static String reverseString(String inputString) {
		char [] sequence = inputString.toCharArray();
		Stack stack = new Stack(sequence.length);
		String outputString = "";
		
		for(int i=0; !stack.isStackFull(); i++)
			stack.push(sequence[i]);
		
		while(!stack.isStackEmpty())
			outputString = outputString + stack.pop().toString();
			
		return outputString;
	}
}