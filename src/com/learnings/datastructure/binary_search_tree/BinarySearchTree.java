package com.learnings.datastructure.binary_search_tree;

public class BinarySearchTree {
	
	private Node rootNode;
	
	private Node currentNode;
	
	public void insert(int data) {
		
		Node newNode = new Node(data);
		
		if(isBinaryTreeEmpty()) {
			rootNode = currentNode = newNode;
		}
		else {
			if(data <= currentNode.getData()) {
				currentNode.setLeftNode(newNode);
			}
			else {
				currentNode.setRightNode(newNode);
			}
		}
	}
	
	public void viewBinaryTree() {
		Node tempNode = rootNode;
		int tabCount = 6;
		StringBuilder builder = new StringBuilder();
		
		//while(tempNode != null) {
			
			printTree(builder, tempNode.getData(), tabCount);
			builder.append("\n");
			if(null != tempNode.getLeftNode()) {
				printTree(builder, tempNode.getLeftNode().getData(), tabCount - 1);
			}
			if(null != tempNode.getRightNode()) {
				printTree(builder, tempNode.getRightNode().getData(), tabCount-3);
			}
			builder.append("\n");
		//}
		System.out.println(builder.toString());
	}
	
	public boolean isBinaryTreeEmpty() {
		return rootNode == null;
	}
	
	private void printTree(StringBuilder builder, int data, int tabCount) {
		for(int i = 0; i < tabCount; i++) {
			builder.append("\t");
		}
		builder.append(data);
	}
}