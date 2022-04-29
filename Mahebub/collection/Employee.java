package collection;

import java.util.HashMap;
import java.util.Iterator;

public class Employee {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(001, "smith");
		map.put(002, "roy");
		map.put(003, "john");
		map.put(004, "robert");
		map.put(005, "pitter");

		Iterator<Integer> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			Integer key = (Integer) itr.next();
			System.out.println(key+" : "+map.get(key));
		}
	}

}
