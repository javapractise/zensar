// Java Single Level Inheritance

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
	public void print()
	{
		System.out.println("Id : "+this.id+"\nName : "+this.name);
	}
}

class Mngr extends Employees{
	Mngr(int id, String name)
	{	
		super(id, name);
	}
}

public class SingleLevel{
	public static void main(String[] args)
	{
		Mngr m  =new Mngr (1, "Chris");
		m.print();
	}
}