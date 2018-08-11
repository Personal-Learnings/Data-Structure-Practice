package com.learnings.datastructure.binary_search_tree;

public class BinarySearchTree {

	private Node rootNode;

	public void insert(int data) {

		Node newNode = new Node(data);
		if(isBinaryTreeEmpty()) {
			rootNode = newNode;
		}
		else {
			Node currentNode = rootNode;
			//insertUsingLoop(currentNode, newNode);
			insertUsingRecursion(currentNode, newNode);
		}
	}

	public void insertUsingLoop(Node currentNode, Node newNode) {

		while(currentNode != null) {
			if(newNode.getData() <= currentNode.getData()) {
				if(currentNode.getLeftNode() == null) {
					currentNode.setLeftNode(newNode);
					break;
				}
				else {
					currentNode = currentNode.getLeftNode();
				}
			}
			else {
				if(currentNode.getRightNode() == null) {
					currentNode.setRightNode(newNode);
					break;
				}
				else {
					currentNode = currentNode.getRightNode();
				}
			}
		}
	}

	public void insertUsingRecursion(Node currentNode, Node newNode) {

		if(newNode.getData() <= currentNode.getData()) {
			if(currentNode.getLeftNode() == null) {
				currentNode.setLeftNode(newNode);
			}
			else {
				currentNode = currentNode.getLeftNode();
				insertUsingRecursion(currentNode, newNode);
			}
		}
		else {
			if(currentNode.getRightNode() == null) {
				currentNode.setRightNode(newNode);
			}
			else {
				currentNode = currentNode.getRightNode();
				insertUsingRecursion(currentNode, newNode);
			}
		}
	}

	public boolean isBinaryTreeEmpty() {
		return rootNode == null;
	}	
}