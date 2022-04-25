
interface employee
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

class company implements employee{
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
public class nestedinter {
	public static void main(String[] args)
	{
		company c=new company();
		c.data();
		c.amount();
		c.dept();
	}
}
