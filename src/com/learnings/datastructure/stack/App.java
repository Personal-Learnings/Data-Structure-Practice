package com.learnings.datastructure.stack;

/**
 * 
 * @author Madanraj Venkatesan
 *
 */
public class App {
	
	public static void main(String[] args) {
		Stack stack = new Stack(10);
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println(reverseString("nasetakneV jarnadaM"));
	}
	
	private static String reverseString(String inputString) {
		char [] sequence = inputString.toCharArray();
		Stack stack = new Stack(sequence.length);
		String outputString = "";
		
		for(int i=0; !stack.isFull(); i++)
			stack.push(sequence[i]);
		
		while(!stack.isEmpty())
			outputString = outputString + stack.pop().toString();
			
		return outputString;
	}
}