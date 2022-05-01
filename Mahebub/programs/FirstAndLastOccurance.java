package programs;

import java.util.LinkedList;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();

		name.add("smith");
		name.add("abdulla");
		name.add("govind");
		name.add("roy");
		name.add("rahul");
		
		System.out.println("Original Linked List: "+name);
		System.out.println("First occurance: "+name.getFirst());
		System.out.println("Last occurance: "+name.getLast());
	}

}
