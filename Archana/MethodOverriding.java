/*Method overriding*/

class Employee{
	void display()
	{
		System.out.println("Id is 67741");
	}
}
class  Id extends Employee{
	void display()
	{
		System.out.println("Id is 21000");
	}
}
public class MethodOverriding {
	public static void main(String[] args)
	{
		Id i = new Id();
		i.display();
	}
}