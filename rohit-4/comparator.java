

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class employee{
	int salary;
	String name;
	public employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
}

public class comparator {
	  public static void main(String[] args) {
	      List<employee> l1 = new ArrayList<employee>();

	      l1.add(new employee( "rohit", 40000));
	      l1.add(new employee("krishna", 25000));
	      l1.add(new employee("rushi", 70000));
	      System.out.println("employee list");

	      Collections.sort(l1, (p1, p2) -> {
	         return p1.name.compareTo(p2.name); 
	      }); 
	      for(employee e : l1) {
	         System.out.println(e.name + " " + e.salary);
	      }
	   }

}
