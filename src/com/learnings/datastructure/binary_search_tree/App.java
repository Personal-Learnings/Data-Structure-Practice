package com.learnings.datastructure.binary_search_tree;

public class App {
	
	public static void main(String[] args) {
		BinarySearchTree binaryTree = new BinarySearchTree();
		binaryTree.insert(20);
		binaryTree.insert(10);
		binaryTree.insert(30);
		System.out.println(binaryTree);
	}
}