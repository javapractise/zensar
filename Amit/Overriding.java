// Method Overriding

class Employee{
	public void print()
	{
		System.out.println("This is from Employee class");
	}
}

class Manager extends Employee{
	public void print()
	{
		System.out.println("This is from Manager Class");
	}
}

class Overriding{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.print();

		Manager m = new Manager();
		m.print();
	}
}