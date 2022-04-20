

class student{
	String name;
	int rollno;
	void display(String name,int rollno)
	{
		System.out.println("name of student is:"+ name);
		System.out.println("rollno of student is:"+ rollno);
	}
}
public class ten {
	public static void main(String[] args)
	{
		student s= new student();
		s.display("john");
		s.display(2);
	}

}
