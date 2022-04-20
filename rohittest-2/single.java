/*taking a class organization and inheriting it into the base class employee.*/

class organization
{
	String name="zensar";
	void display() {
		System.out.println("Name of organization is:"+name);
	}
}
class emp extends organization{
	String emp_name="rohit";
	void display1() {
		System.out.println("Name of employee is:"+emp_name);
	}
}
public class single{
	public static void main(String[] args)
	{
		emp e= new emp();
		e.display();
		e.display1();
	}

}
