import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class SetExample {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(15);
		hs.add(13);
		hs.add(12);
		hs.add(11);
		hs.add(14);
		
		Iterator<Integer> itr = hs.iterator();
		
		while(itr.hasNext()) {
			Integer a = itr.next();
			System.out.println(a);
		}
	}

}