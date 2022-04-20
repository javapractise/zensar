class College
{
	String name="Spec";
	String dept="CSE";
	void display() {
		System.out.println("Name of College is:"+name);
	}
}
class Student extends College{
	String stu_name="abc";
	void display1() {
		System.out.println("Name of Student is:"+stu_name);
	}
}
class Deparment extends Student{
	void display3()
	{
		System.out.println("Department of student is:"+dept);
	}
}
public class Multilevel{
	public static void main(String[] args)
	{
		Department d= new Department();
		d.display();
		d.display1();
		d.display3();
	}

}