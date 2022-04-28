class Outer
{
	public void display()
	{	System.out.println("This is the Outer class");	}
	class Inner
	{
		public void show()
		{	System.out.println("This is the inner class");	}
	}
}

public class InnerExample{
	public static void main(String[] args)
	{
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		out.display();
		in.show();
	}
}