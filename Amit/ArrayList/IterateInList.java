import java.util.*;

public class IterateInList{
	public static void main(String[] args)
	{	
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		Iterator itr = a.listIterator(0);
		System.out.print("\n [\t");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" \t");
		}
		System.out.print("]\n");
	}
	
}