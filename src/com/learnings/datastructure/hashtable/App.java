package com.learnings.datastructure.hashtable;

public class App {

	public static void main(String[] args) {
		
		HashTable hashTable = new HashTable(4);
		hashTable.insert("India");
		hashTable.insert("UK");
		hashTable.insert("Dubai");
		hashTable.insert("USA");
		hashTable.insert("Australia");
		hashTable.viewHashTable();
	}
}
