interface show
{
	public void display(){
		System.out.println("this is show interface");
		}
}
class show1 implements show{

	public void display()
	{
	System.out.println("this is show1 interface");
	}
}
  public static void main (String args[])
{
	show1 s = new show1();
	s.display();
}