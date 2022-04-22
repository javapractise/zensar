// Java Method Overloading

import java.util.*;
import java.util.lang;

class Employees{
	public void print(int id, String name)
	{
		System.out.println("Id \t: "+id+"\nName \t: "+name);
	}
	public void print(int id, String name, int sal)
	{
		System.out.println("Id \t: "+id+"\nName \t: "+name+"\nSalary \t: "+sal);
	}
}

class OverLoading{
	public static void main(String[] args)
	{
		Employees e = new Employees();
		e.print(1, "Johny");
		System.out.println("------------");
		e.print(1, "Jorden", 20000);
	}
}