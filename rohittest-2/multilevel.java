/*taking class organization and inheriting to emp and emp to account (multilevel-inheritance)*/

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
class account extends emp{
	void display3()
	{
		System.out.println("salary of the employee is:"+salary);
	}
}
public class multilevel{
	public static void main(String[] args)
	{
		account a= new account();
		a.display();
		a.display1();
		a.display3();
	}

}
