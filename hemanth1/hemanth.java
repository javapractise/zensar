//searching
package arraylist;

import java.util.ArrayList;

public class search {

	public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(11);
	l1.add(15);
	l1.add(20);
	l1.add(25);
	Boolean ans=l1.contains(10);
	if(ans)
	{
		System.out.println("element found :"+ans);
	}
	else
	{
		System.out.println("element not found");
	}

	}

}