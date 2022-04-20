
class parent {
	void display()
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
public class first{
	public static void main(String[] args)
	{
		parent p= new parent();
		child c= new child();
		p.display();
		c.display1();
		c.display();
	}
	
}
