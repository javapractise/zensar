import java.util.*;

class SortList{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Mike");
		list.add("Glenn");
		list.add("Bravis");
		Iterator <String> itr = list.iterator();
		Collections.sort(list);
		System.out.println(list);
	}
}