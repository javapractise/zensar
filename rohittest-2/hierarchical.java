/*taking a class organizaton and inheriting into both emp and accounts(hierarchical-inheritance)*/

class organization
{
	String name="zensar";
	int salary=30000;
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
class account extends organization{
	void display3()
	{
		System.out.println("salary of the employee is:"+salary);
	}
}
public class hierarchical{
	public static void main(String[] args)
	{
		account a= new account();
		emp e =new emp();
		a.display();
		a.display3();
		e.display();
		e.display1();
	}

}
