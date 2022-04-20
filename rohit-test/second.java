
 class parent {
	private void display()
	{
		System.out.println("this is parent class ");
	}
}
class child extends parent{
	void display1()
	{
		System.out.println("this is chaild class ");
	}
}
public class second{
	public static void main(String[] args)
	{
		parent p= new parent();
		child c= new child();
		p.display();
		c.display1();
	}
	
}
