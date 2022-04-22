// Method Overloading

class Employee{
	public void print(int id, String name)
	{
		System.out.println("ID \t: "+id+"\nName \t: "+name);
	}
	public void print(int id, String name, int sal)
	{
		System.out.println("ID \t: "+id+"\nName \t: "+name+"\nSalary \t: "+sal);
	}
}

class Overloading{
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.print(1, "John");
		System.out.println("================");
		e.print(1, "Mike", 40000);
	}
}