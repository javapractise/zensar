// Single Level Inheritance

class Employee{
	int id;
	String name;
	Employee(int id, String name)
	{	
		this.id = id;
		this.name = name;
	}
	public void print()
	{
		System.out.println("ID : "+this.id+"\nName : "+this.name);
	}
}

class Manager extends Employee{
	Manager(int id, String name)
	{	
		super(id, name);
	}
}

public class Single{
	public static void main(String[] args)
	{
		Manager m  =new Manager(1, "Mike");
		m.print();
	}
}