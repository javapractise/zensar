import java.util.HashMap;
import java.util.Iterator;

public class EmployeeData {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(001, "shubhan");
		map.put(002, "mohan");
		map.put(003, "raju");
		map.put(004, "karan");
		map.put(005, "sam");

		Iterator<Integer> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			Integer key = (Integer) itr.next();
			System.out.println(key+" : "+map.get(key));
		}
	}

}