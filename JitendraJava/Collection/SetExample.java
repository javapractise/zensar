package javaprogram;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		
		h.add(15);
		h.add(13);
		h.add(12);
		h.add(11);
		h.add(14);
		
		Iterator<Integer> itr = h.iterator();
		
		while(itr.hasNext()) {
			Integer a = itr.next();
			System.out.println(a);
		}
	}

}