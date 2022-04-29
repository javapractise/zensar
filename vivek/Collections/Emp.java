import java.util.HashMap;
import java.util.Iterator;

public class Employee {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(001, "vivek");
		map.put(002, "rajan");
		map.put(003, "mohsin");
		map.put(004, "saif");
		map.put(005, "sameer");

		Iterator<Integer> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			Integer key = (Integer) itr.next();
			System.out.println(key+" : "+map.get(key));
		}
	}

}