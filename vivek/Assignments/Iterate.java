import java.util.Iterator;
import java.util.LinkedList;

public class IterateAll {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("vivek");
		list.add("rajan");
		list.add("mohsin");
		list.add("saif");
		list.add("sameer");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
	}

}