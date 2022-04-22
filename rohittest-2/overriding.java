/*method overriding*/

class student{
	void display()
	{
		System.out.println("roll no of student is 1212");
	}
}
class rollno extends student{
	void display()
	{
		System.out.println("Roll no of student is 1207");
	}
}
public class overriding {
	public static void main(String[] args)
	{
		rollno r = new rollno();
		r.display();
	}
}
