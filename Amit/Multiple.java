// Multiple Inheritance

interface Emp{
	public void work();
}

interface Manager{
	public void work();
}

class HR implements Emp, Manager{
	public void work()
	{
		System.out.println("Do Your Work Properly");
	}
}

public class Multiple{
	public static void main(String[] args)
	{
		HR h = new HR();
		h.work();
	}
}