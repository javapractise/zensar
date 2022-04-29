//first and last index

package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class search {

	public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList();
	l1.add(10);
	l1.add(11);
	l1.add(15);
	l1.add(20);
	l1.add(25);
	System.out.println(l1.get(0));
	int n=l1.size();
	System.out.println(l1.get(n-1));

}
}