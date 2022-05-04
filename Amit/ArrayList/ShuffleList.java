import java.util.*;

public class ShuffleList{
	public static void main(String[] args)
	{	
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println("List before Shuffle : "+a);
		Collections.shuffle(a);
		System.out.println("List after Shuffle : "+a);
	}
}