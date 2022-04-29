

import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class Failsafe {
	public static void main(String[] args) throws Exception
	{
		// Creating a Hash Map
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);

		// Getting an iterator from map
		Iterator itr = map.keySet().iterator();

		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println(s);

			map.put("Five", 5);
		}
	}
}