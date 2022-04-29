/copying

package arraylist;

import java.util.ArrayList;

public class search {

	public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList();
	l1.add(10);
	l1.add(11);
	l1.add(15);
	l1.add(20);
	l1.add(25);
	for(Integer op1:l1)
	{
	System.out.println("first list :"+op1);
	}
	ArrayList<Integer> L2=l1;
	
	for(Integer op:L2)
	{
		System.out.println("second list :"+op);
	}
	}

}