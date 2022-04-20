// Multi Level Inheritance

class Employee{
	int id;
	String name;
	Employee(int id, String name)
	{	
		this.id = id;
		this.name = name;
	}
}

class Manager extends Employee{
	int sal;
	Manager(int id, String name, int sal)
	{	
		super(id, name);
		this.sal = sal;
	}
	public void print()
	{
		System.out.println("ID \t: "+super.id+"\nName \t: "+super.name+"\nSalary \t: "+this.sal);
	}
}

class HR extends Manager{
	HR(int id, String name, int sal)
	{
		super(id, name, sal);
	}
}

public class MultiLevel{
	public static void main(String[] args)
	{
		HR h  =new HR(1, "Mike", 30000);
		h.print();
	}
}

