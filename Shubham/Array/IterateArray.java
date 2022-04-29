import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class IterateArray {
	public static void main(String[] args)
	{

		LinkedList<Integer> linkedList = new LinkedList<>();

		linkedList.add(40);
		linkedList.add(44);
		linkedList.add(80);
		linkedList.add(9);

		iterateUsingForLoop(linkedList);
	}

	public static void
			iterateUsingForLoop(LinkedList<Integer> linkedList)
	{

		System.out.print(
			"Iterating the LinkedList using a simple for loop : ");

		for (int i = 0; i < linkedList.size(); i++) {
			System.out.print(linkedList.get(i) + " ");
		}
	}
}
