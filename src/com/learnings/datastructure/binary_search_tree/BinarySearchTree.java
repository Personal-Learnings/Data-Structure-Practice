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
			if(newNode.getData() < currentNode.getData()) {
				if(currentNode.getLeftNode() == null) {
					currentNode.setLeftNode(newNode);
					break;
				}
				else {
					currentNode = currentNode.getLeftNode();
				}
			}
			else if(newNode.getData() > currentNode.getData()) {
				if(currentNode.getRightNode() == null) {
					currentNode.setRightNode(newNode);
					break;
				}
				else {
					currentNode = currentNode.getRightNode();
				}
			}
			else {
				System.out.println("Duplicate Node: " + newNode.getData());
				break;
			}
		}
	}

	public void insertUsingRecursion(Node currentNode, Node newNode) {

		if(newNode.getData() < currentNode.getData()) {
			if(currentNode.getLeftNode() == null) {
				currentNode.setLeftNode(newNode);
			}
			else {
				currentNode = currentNode.getLeftNode();
				insertUsingRecursion(currentNode, newNode);
			}
		}
		else if(newNode.getData() > currentNode.getData()) {
			if(currentNode.getRightNode() == null) {
				currentNode.setRightNode(newNode);
			}
			else {
				currentNode = currentNode.getRightNode();
				insertUsingRecursion(currentNode, newNode);
			}
		}
		else {
			System.out.println("Duplicate Node: " + newNode.getData());
		}
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
	
	public void deleteNode(int data) {
	
		// To Delete the Root Node
		if(null != rootNode && data == rootNode.getData()) {
			rootNode = null;
		}
		
		Node currentNode, parentNode;
		currentNode = parentNode = rootNode;
		
		// To Find the Node and Its Parent
		while(currentNode != null) {
			
			if(data == currentNode.getData()) {
				break;
			}
			else if(data < currentNode.getData()) {
				parentNode = currentNode;
				currentNode = currentNode.getLeftNode();
			}
			else {
				parentNode = currentNode;
				currentNode = currentNode.getRightNode();
			}
		}
		
		if(currentNode == null) {
			System.out.println("Nothing to Delete.");
			return;
		}
		else if(isLeafNode(currentNode)) {
			parentNode.setLeftNode(null);
			parentNode.setRightNode(null);
		}
		else if(isNodeHasOnlyLeftChildren(currentNode)) {
			if(parentNode.getData() > currentNode.getData()) {
				parentNode.setLeftNode(currentNode.getLeftNode());
			}
			else {
				parentNode.setRightNode(currentNode.getLeftNode());
			}
		}
		else if(isNodeHasOnlyRightChildren(currentNode)) {
			if(parentNode.getData() > currentNode.getData()) {
				parentNode.setLeftNode(currentNode.getRightNode());
			}
			else {
				parentNode.setRightNode(currentNode.getRightNode());
			}
		}
		else if(isNodeHasBothChildren(currentNode)) {
			
			//In-Order Successor Technique
			Node inOrderSuccessorNode = currentNode.getRightNode();
			Node inOrderSuccessorParentNode = currentNode.getRightNode();

			while(inOrderSuccessorNode != null) {
				if(inOrderSuccessorNode.getLeftNode() != null) {
					inOrderSuccessorParentNode = inOrderSuccessorNode;
					inOrderSuccessorNode = inOrderSuccessorNode.getLeftNode();
				}
				else
					break;
			}
			
			//Taking a backup of Right Node of the Node to be Deleted
			Node rightNodeOfCurrentNode = currentNode.getRightNode();
			
			//Replacing the Current Node with In-Order Successor Node Details
			currentNode.setData(inOrderSuccessorNode.getData());
			if(inOrderSuccessorNode.getRightNode() != null) {
				currentNode.setRightNode(inOrderSuccessorNode.getRightNode()); // Only right as there wont be any left node for sure
			}
			
			//Find the Max of the In-Order Successor Right Node
			Node inOrderSuccessorMaxNode = getMaxNode(inOrderSuccessorNode);
			
			//Assign the Right Node of your Current Node to the In-Order Successor Max Node
			inOrderSuccessorMaxNode.setRightNode(rightNodeOfCurrentNode);
			
			//Delete the In-Order Successor Node
			if(null != inOrderSuccessorParentNode.getLeftNode()) {
				inOrderSuccessorParentNode.setLeftNode(null);
			}
			else {
				inOrderSuccessorParentNode.setRightNode(null);
			}
		}
	}
	
	private boolean isNodeHasOnlyRightChildren(Node currentNode) {
		return (currentNode.getLeftNode() == null && currentNode.getRightNode() != null);
	}

	private boolean isNodeHasOnlyLeftChildren(Node currentNode) {
		return (currentNode.getLeftNode() != null && currentNode.getRightNode() == null);
	}

	private boolean isNodeHasBothChildren(Node currentNode) {
		return (currentNode.getLeftNode() != null && currentNode.getRightNode() != null);
	}

	private boolean isLeafNode(Node currentNode) {
		return (currentNode.getLeftNode() == null && currentNode.getRightNode() == null);
	}

	public Node findNode(int data) {
		
		Node currentNode = rootNode;
		
		while(currentNode != null) {
			if(data == currentNode.getData()) {
				break;
			}
			else if(data < currentNode.getData()) {
				currentNode = currentNode.getLeftNode();
			}
			else {
				currentNode = currentNode.getRightNode();
			}
		}
		return currentNode;
	}

	public boolean isBinaryTreeEmpty() {
		return rootNode == null;
	}	
}