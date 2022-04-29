package javaprogram;
import java.util.HashMap;
import java.util.Iterator;

public class Employee {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Jitendra");
		map.put(2, "Abhinav");
		map.put(3, "Rajesh");
		map.put(4, "Akash");
		map.put(5, "Vikash");

		Iterator<Integer> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			Integer key = (Integer) itr.next();
			System.out.println(key+" : "+map.get(key));
		}
	}

}