import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

class AccessFirstAndLastElements {
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(2);
		ll.add(5);
		ll.add(5);
		ll.add(7);
		ll.add(10);
		ll.add(6);

		System.out.println("First Element is : "
						+ ll.getFirst());

		System.out.println("Last Element is : "
						+ ll.getLast());
	}
}

