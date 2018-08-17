package com.learnings.datastructure.hashtable;

public class HashTable {
	
	private Object [] data;
	
	private int capacity;
	
	private int size;
	
	public HashTable(int capacity) {
		
		if(!isPrimeNumber(capacity)) {
			this.capacity = getNextPrimeNumber(capacity);
			System.out.println("Since " + capacity + " is not a prime number, so increasing the capacity to the next prime number " + this.capacity);
		}
		else {
			this.capacity = capacity;
		}
		this.data = new Object[this.capacity];
		this.size = 0;
	}
	
	private int getNextPrimeNumber(int number) {
		int i = number;
		while(true) {
			if(isPrimeNumber(i))
				return i;
			++i;
		}
	}

	private boolean isPrimeNumber(int number) {
		for(int i = 2; i * i <= number; i++) {
	        if(number % i == 0)
	            return false;
	    }
	    return true;
	}

	private int hash(Object element) {
		int hashCode = Math.abs(element.hashCode() % capacity);
		return hashCode;
	}
	
	private int doubleHash(Object element) {
		int hashCode = Math.abs(element.hashCode() % capacity);
		hashCode = 3 - (hashCode % 3);
		return (hashCode == 0) ? hashCode += capacity : Math.abs(hashCode);
	}
	
	public void insert(Object element) {
		if(!isHashTableFull()) {
			int index = hash(element);
			
			if(data[index] == null) {
				data[index] = element;
				size++;
				System.out.println("Inserting the Object at Position " + index);
			}
			else {
				while(true) {
					index = (index + doubleHash(element)) % capacity;
					if(data[index] == null) {
						data[index] = element;
						size++;
						System.out.println("Inserting the Object at Position " + index);
						return;
					}
				}
			}
		}
		else {
			System.out.println("Hash Table Full !!!");
		}
	}
	
	public Object find(Object element) {
		Object newElement = null;
		if(!isHashTableEmpty()) {
			
			int index = hash(element);
			
			if(data[index] != null && data[index].equals(element)) {
				newElement = data[index];
			}
			else {
				while(true) {
					index = (index + doubleHash(element)) % capacity;
					if(data[index] != null) {
						newElement = data[index];
						return;
					}
				}
			}
		}
		else {
			System.out.println("HashTable Empty.");
		}
		return newElement;
	}

	public int getSize() {
		return size;
	}
	
	public boolean isHashTableFull() {
		return size == capacity;
	}
	
	public boolean isHashTableEmpty() {
		return size == 0;
	}

	public void viewHashTable() {
		System.out.print("[ ");
		for(int i = 0; i < capacity; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println("]");
	}
}