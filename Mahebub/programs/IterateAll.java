package programs;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateAll {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("robert");
		list.add("william");
		list.add("pitter");
		list.add("henry");
		list.add("john");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
	}

}
