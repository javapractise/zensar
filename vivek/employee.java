//nested
interface Employee{
	public void work();

	interface Person{
		public void join();
	}
	
}

public class Test implements Employee{
	public void work()
	{
		System.out.println("Employees are working");
	}
	public void join()
	{
		System.out.println("joining ");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.work();
		t.join();
	}
}