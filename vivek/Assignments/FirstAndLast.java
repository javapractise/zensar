import java.util.LinkedList;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();

		name.add("vivek");
		name.add("rajan");
		name.add("mohsin");
		name.add("saif");
		name.add("sameer");
		
		System.out.println("Original Linked List: "+name);
		System.out.println("First occurance: "+name.getFirst());
		System.out.println("Last occurance: "+name.getLast());
	}

}