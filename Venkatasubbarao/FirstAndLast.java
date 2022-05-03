import java.util.*;

public class FirstAndLast{
	public static void main(String[] args)
	{	
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println("Complete List : "+a);
		System.out.println("First Element : "+a.getFirst());
		System.out.println("Last Element : "+a.getLast());
	}

}