interface emp
{
	void data();
	interface salary
	{	
		void amount();
	}
	interface department
	{
		void dept();
	}
}

class company implements emp{
	public void data()
	{
		System.out.println("This is the data of the employee");
	}
	public void amount()
	{
		System.out.println("Salary amount of the employee is 25000");
	}
	public void dept()
	{
		System.out.println("Department of the employee is'software'");
	}
}
public class NestedInterface {
	public static void main(String[] args)
	{
		company c=new company();
		c.data();
		c.amount();
		c.dept();
	}
}
