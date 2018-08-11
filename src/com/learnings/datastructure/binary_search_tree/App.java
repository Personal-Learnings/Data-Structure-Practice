package com.learnings.datastructure.binary_search_tree;

public class App {
	
	public static void main(String[] args) {
		BinarySearchTree binaryTree = new BinarySearchTree();
		binaryTree.insert(20);
		binaryTree.insert(10);
		binaryTree.insert(40);
		binaryTree.insert(30);
		binaryTree.insert(90);
		binaryTree.insert(70);
		binaryTree.insert(70);
		binaryTree.insert(90);
		binaryTree.insert(100);
		binaryTree.insert(1020);
		binaryTree.insert(12);
		binaryTree.insert(18);
		binaryTree.insert(8);
		binaryTree.insert(2020);
		binaryTree.insert(1500);
		System.out.println(binaryTree);
		
		System.out.print(getSpaces(15) + 1);
		System.out.println();
		System.out.print(getSpaces(14) + "/");
		System.out.print(getSpaces(1) + "\\");
		System.out.println();
		System.out.print(getSpaces(13) + "/");
		System.out.print(getSpaces(3) + "\\");
		System.out.println();
		System.out.print(getSpaces(12) + "/");
		System.out.print(getSpaces(5) + "\\");
		System.out.println();
		System.out.print(getSpaces(11) + "/");
		System.out.print(getSpaces(7) + "\\");
		System.out.println();
		System.out.print(getSpaces(10) + "/");
		System.out.print(getSpaces(9) + "\\");
		System.out.println();
		System.out.print(getSpaces(9) + "/");
		System.out.print(getSpaces(11) + "\\");
		System.out.println();
		
		
		System.out.print(getSpaces(8) + "2");
		System.out.print(getSpaces(13) + "3");
		System.out.println();
		
		System.out.print(getSpaces(7) + "/");
		System.out.print(getSpaces(1) + "\\");
		System.out.print(getSpaces(11) + "/");
		System.out.print(getSpaces(1) + "\\");
		System.out.println();
		
		System.out.print(getSpaces(6) + "/");
		System.out.print(getSpaces(3) + "\\");
		System.out.print(getSpaces(9) + "/");
		System.out.print(getSpaces(3) + "\\");
		System.out.println();
		
		System.out.print(getSpaces(5) + "4");
		System.out.print(getSpaces(5) + "5");
		System.out.print(getSpaces(7) + "6");
		System.out.print(getSpaces(5) + "7");
		System.out.println();
		
	}
	private static String getSpaces(int count) {
		StringBuilder spaceBuilder = new StringBuilder();
		for(int i=0; i<count; i++) {
			spaceBuilder.append(" ");
		}
		return spaceBuilder.toString();	
	}
}