package com.learnings.datastructure.my_binary_search_tree;

import com.learnings.datastructure.my_binary_search_tree.Node;

public class MyBinarySearchTree {
	
	private Node rootNode = null;
	
	/**
	 * 	Accepts Duplicates
	 */
	public void insert(int data) {
		Node newNode = new Node(data);
		if(isBinaryTreeEmpty()) {
			rootNode = newNode;
		}
		else {
			insertUsingLoop(newNode);
		}
	}
	
	public void insertUsingLoop(Node newNode) {
		
		Node currentNode = rootNode;

		while(currentNode != null) {
			if(newNode.getKey() < currentNode.getKey()) {
				if(currentNode.getLeftNode() == null) {
					currentNode.setLeftNode(newNode);
					break;
				}
				else {
					currentNode = currentNode.getLeftNode();
				}
			}
			else if(newNode.getKey() > currentNode.getKey()) {
				if(currentNode.getRightNode() == null) {
					currentNode.setRightNode(newNode);
					break;
				}
				else {
					currentNode = currentNode.getRightNode();
				}
			}
			else {
				int count = currentNode.getCount();
				currentNode.setCount(++count);
				break;
			}
		}
	}
	
	public boolean isBinaryTreeEmpty() {
		return rootNode == null;
	}
	
	public Node getMaxNode() {

		Node currentNode = rootNode;

		while(currentNode != null) {
			if(currentNode.getRightNode() != null)
				currentNode = currentNode.getRightNode();
			else
				break;
		}
		return currentNode;
	}
	
	public Node getMaxNode(Node currentNode) {

		while(currentNode != null) {
			if(currentNode.getRightNode() != null)
				currentNode = currentNode.getRightNode();
			else
				break;
		}
		return currentNode;
	}

	public Node getMinNode() {

		Node currentNode = rootNode;

		while(currentNode != null) {
			if(currentNode.getLeftNode() != null)
				currentNode = currentNode.getLeftNode();
			else
				break;
		}
		return currentNode;
	}
	
	public Node getMinNode(Node currentNode) {

		while(currentNode != null) {
			if(currentNode.getLeftNode() != null)
				currentNode = currentNode.getLeftNode();
			else
				break;
		}
		return currentNode;
	}
	
	public void delete(int Key) {
		// Write Implementation
	}
}