// Multiple Inheritance

import java.util.*;
import java.util.lang;

interface Employees{
	public void work();
}

interface Mngr{
	public void work();
}

class HR implements Employees, Mngr{
	public void work()
	{
		System.out.println("Please Complete Work be on Time");
	}
}

public class Multiple{
	public static void main(String[] args)
	{
		HR h = new HR();
		h.work();
	}
}