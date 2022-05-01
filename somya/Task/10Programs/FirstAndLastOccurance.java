import java.util.LinkedList;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();

		name.add("somu");
		name.add("ram");
		name.add("neha");
		name.add("supriya");
		name.add("rahul");
		
		System.out.println("Original Linked List: "+name);
		System.out.println("First occurance: "+name.getFirst());
		System.out.println("Last occurance: "+name.getLast());
	}

}