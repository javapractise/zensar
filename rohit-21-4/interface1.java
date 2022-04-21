
interface employee{
	void data();
}
class company implements employee{
	public void data()
	{
		System.out.println("This is the data of the employee");
	}
}
public class interface1{
	public static void main(String[] args)
	{
		company c=new company();
		c.data();
	}
}
