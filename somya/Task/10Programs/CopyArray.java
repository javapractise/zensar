import java.util.ArrayList;
import java.util.ListIterator;

public class CopyArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
	
		list.add("Raju");
		list.add("Somu");
		list.add("Neha");
		list.add("Ram");
		list.add("Supriya");
		list.add("Sweety");
		
		System.out.println("Array 1");
		ListIterator<String> listItr =list.listIterator();
		while(listItr.hasNext())
		{
			String s =listItr.next();
			System.out.println(s);
		}
		System.out.println("End of Array 1");
		System.out.println();
		ArrayList<String > copyList =new ArrayList<>();
		copyList.addAll(list);
		System.out.println("Array 2");
		ListIterator<String> listItr2 =list.listIterator();
		while(listItr2.hasNext())
		{
			String s1 =listItr2.next();
			System.out.println(s1);
		}

	}
}