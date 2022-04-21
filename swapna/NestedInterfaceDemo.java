interface show {
	public void display();
}
interface show1
{
	public void display1();
}
class main implements show.show1{
	public void display1(){
	System.out.println("this is show1 interface");
	}
}
class outer implements show{
	public void display()
	{
	System.out.println("this is show interface");
	}
	
}
public class NestedInterfaceDemo{
	public static  void main (String args[])
	{
		main m = new main();
		m.display1();
		outer n = new outer();
		n.display;
	}
}