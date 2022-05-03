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