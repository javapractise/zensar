class Parent{
	private void parentPrint()
	{
		System.out.println("This is parent class");
	}
}

class Child extends Parent{
	public void childPrint()
	{
		System.out.println("This is child class");
	}
}

public class Second{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		// p.parentPrint();

		Child c = new Child();
		c.childPrint();

		//c.parentPrint();
	}
}