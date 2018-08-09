package com.learnings.datastructure.binary_search_tree;

public class BinarySearchTree {
	
	private Node rootNode;
	
	private Node currentNode;
	
	public void insert(int data) {
		if(isBinaryTreeEmpty()) {
			rootNode = new Node();
			rootNode.setData(data);
			currentNode = rootNode;
		}
		else {
			if(data <= currentNode.getData()) {
				Node newNode = new Node();
				newNode.setData(data);
				currentNode.setLeftNode(newNode);
			}
			else {
				Node newNode = new Node();
				newNode.setData(data);
				currentNode.setRightNode(newNode);
			}
		}
	}
	
	public void viewBinaryTree() {
		Node tempNode = rootNode;
		while(tempNode != null) {
		}
	}
	
	public boolean isBinaryTreeEmpty() {
		return rootNode == null;
	}
}