// Multiple Level Inheritance

import java.util.*;
import java.util.lang;

class Employees{
	int id;
	String name;
	Employees(int id, String name)
	{	
		this.id = id;
		this.name = name;
	}
}

class Mngr extends Employees{
	int sal;
	Mngr(int id, String name, int sal)
	{	
		super(id, name);
		this.sal = sal;
	}
	public void print()
	{
		System.out.println("ID \t: "+super.id+"\nName \t: "+super.name+"\nSalary \t: "+this.sal);
	}
}

class HR extends Mngr{
	HR(int id, String name, int sal)
	{
		super(id, name, sal);
	}
}

public class MultipleLevel{
	public static void main(String[] args)
	{
		HR h  =new HR(1, "Mike", 30000);
		h.print();
	}
}