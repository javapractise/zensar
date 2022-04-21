// Nested Interface

import java.util*;
import java.util.lang;

interface Employees{
	public void work();

	interface Person{
		public void join();
	}
	
}

public class Test implements Employees{
	public void work()
	{
		System.out.println("All Employees are working Always");
	}
	public void join()
	{
		System.out.println("New Empoyees joining ");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.work();
		t.join();
	}
}