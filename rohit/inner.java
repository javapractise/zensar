

class outerclass{
	 String s;

	void display(String s)
	{
		this.s=s;
		System.out.println("this is outer class-"+s);
	}
	class innerclass{
		void display1()
		{
			System.out.println("this is inner class");
		}
	}
}

public class inner {
	public static void main(String[] args)
	{
		outerclass o= new outerclass();
		outerclass.innerclass i= o.new innerclass();
		o.display("rohit");
		i.display1();
	}
}
