import java.util.*;
class Employee extends Object{
	public int id;
	public String name;

	Employee(int id, String name)
	{	
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return "[ Id : "+this.id+" , Name : "+this.name+" ]";
	}
}

public class EmployeeDriver{
	public static void main(String[] args)
	{
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1,"John"));
		emp.add(new Employee(2, "Jack"));
		emp.add(new Employee(3, "Mike"));
		emp.add(new Employee(4, "James")); 


		for(int i=0 ; i< emp.size() ; i++)
		{
			System.out.println(emp.get(i));
		}
	}
} 
 21  
Amit/FailFast.java
@@ -0,0 +1,21 @@
import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class FailFast{
	public static void main(String[] args)
	{
		Map<Integer, String> emp = new HashMap<Integer, String>();
		emp.put(1, "John");
		emp.put(2, "Mike");
		emp.put(3, "David");

		Iterator itr = emp.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(emp.get(itr.next()));

			emp.put(4, "Brawis");
		}
	}
} 
