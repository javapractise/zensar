package vinaytest15;
import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			Integer a = (Integer) itr.next();
			list.add(6); //This will give ConcurrentModificationException
		}
	}

}