
import java.util.*;

public class ReverseList{
	public static void main(String[] args)
	{	
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println("List before reverse : "+a);
		Collections.reverse(a);
		System.out.println("List after reverse : "+a);
	}
} 