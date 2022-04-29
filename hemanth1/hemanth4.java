//reverse elements

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
	
	System.out.println("befor reverse :"+l1);
	Collections.reverse(l1);
	System.out.println("after reverse :"+l1);
	
	
	}

}