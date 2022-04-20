// Hierarchical Inhertitance

class Employee{
	int id;
	String name;
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

class DevManager extends Employee{
	int sal;
	DevManager(int id, String name, int sal)
	{
		super(id, name);
		this.sal = sal;
	}
	public void print()
	{
		System.out.println("From DevManager Class: \n");
		System.out.println("ID \t: "+super.id+"\nName \t: "+super.name+"\nSalary \t: "+this.sal);
	}
}

class TestManager extends Employee{
	int sal;
	TestManager(int id, String name, int sal)
	{
		super(id, name);
		this.sal = sal;
	}
	public void print()
	{
		System.out.println("\n==============\nFrom TestManager Class: \n");
		System.out.println("ID \t: "+super.id+"\nName \t: "+super.name+"\nSalary \t: "+this.sal);
	}
}

public class Hierarchical{
	public static void main(String[] args)
	{
		DevManager dm = new DevManager(1, "John", 70000);
		dm.print();

		TestManager tm = new TestManager(2, "Mike", 60000);
		tm.print();
	}
}