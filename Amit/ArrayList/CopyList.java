import java.util.*;

class CopyList{
	public static void main(String[] args)
	{
		List<String> l1 = new ArrayList<String>();
		l1.add("Apple");
		l1.add("Banana");
		List<String> l2 = new ArrayList<String>();
		l2.add("Mango");
		l2.add("Strawberry");
		Collections.copy(l1, l2);
		System.out.println(l1);
		
	}
}