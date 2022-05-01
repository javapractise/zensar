package com.java.collection.Questiion10;

import java.util.LinkedList;
import java.util.List;

public class FirstLastOccrLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list =new LinkedList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
	System.out.println("First Element ="+	list.getFirst());
	System.out.println("Last Element ="+	list.getLast());
	
	}

}
