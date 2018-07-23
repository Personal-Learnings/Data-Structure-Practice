package com.learnings.datastructure.linkedlist;

public class App {

	public static void main(String[] args) {

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.add("First");
		linkedList.add("Second");
		linkedList.add("Third");
		
		System.out.println(linkedList.toString());
		System.out.println("\nRemoving.. Second Node______________________\n");
		linkedList.remove("sdsd");
		System.out.println(linkedList.toString());
		
		//System.out.println(linkedList.get("Second").getData() + " ::: " + linkedList.get("Second").getReference());
	}
}