import java.util.HashMap;
import java.util.Iterator;

public class Employee {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(001, "a");
		map.put(002, "b");
		map.put(003, "c");
		map.put(004, "d");
		map.put(005, "e");

		Iterator<Integer> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			Integer key = (Integer) itr.next();
			System.out.println(key+" : "+map.get(key));
		}
	}

}