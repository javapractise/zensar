
interface employee{
	void data();
}
interface salary extends employee{
	void amount();
}
class company implements salary{
	public void data()
	{
		System.out.println("This is the data of the employee");
	}
	public void amount()
	{
		System.out.println("Salary amount of the employee is 25000");
	}
}
public class extendsinter {
	public static void main(String[] args)
	{
		company c=new company();
		c.data();
		c.amount();
	}
}
