import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);

		Iterator<String> itr = map.keySet().iterator();

		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println(key + " : " + map.get(key));
			map.put("FIVE", 5);
		}
	}

}