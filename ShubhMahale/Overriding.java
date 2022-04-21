// Java Method Overriding

import java.util.*;
import java.util.lang;

class Employees{
	public void print()
	{
		System.out.println("Employees Class");
	}
}

class Mngr extends Employees{
	public void print()
	{
		System.out.println("Manager Class");
	}
}

class Overriding{
	public static void main(String[] args)
	{
		Employees e = new Employees();
		e.print();

		Mngr m = new Mngr();
		m.print();
	}
}