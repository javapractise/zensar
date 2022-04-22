
interface account{
	public void display1();
}
class organization
{
	String name="zensar";
	void display() {
		System.out.println("Name of organization is:"+name);
	}
}
class emp extends organization implements account{
	String emp_name="rohit";
	public void display1() {
		System.out.println("Name of employee is:"+emp_name);
	}
}
public class multiple{
	public static void main(String[] args)
	{
		emp e= new emp();
		e.display();
		e.display1();
	}

}
