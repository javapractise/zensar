// Hierarchical Inhertitance

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

class DevelopmentTeam extends Employees{
	int sal;
	DevelopmentTeam(int id, String name, int sal)
	{
		super(id, name);
		this.sal = sal;
	}
	public void print()
	{
		System.out.println("From DevelopmentTeam: \n");
		System.out.println("Id \t: "+super.id+"\nName \t: "+super.name+"\nSalary \t:"+this.sal);
	}
}

class TestingTeam extends Employees{
	int sal;
	TestingTeam(int id, String name, int sal)
	{
		super(id, name);
		this.sal = sal;
	}
	public void print()
	{
		System.out.println("\n From TestingTeam: ");
		System.out.println("Id \t: "+super.id+"\nName \t: "+super.name+"\nSalary \t:"+this.sal);
	}
}

public class Hierarchical{
	public static void main(String[] args)
	{
		DevelopmentTeam dm = new DevelopmentTeam(1, "rocky", 80000);
		dm.print();

		TestingTeam tm = new TestingTeam(2, "Sam", 70000);
		tm.print();
	}
}