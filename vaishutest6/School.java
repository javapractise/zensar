package project1;


interface students
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

class School implements students{
	public void data()
	{
		System.out.println("This is the data of the students");
	}
	public void amount()
	{
		System.out.println("Salary amount of the employee is 25000");
	}
	public void dept()
	{
		System.out.println("Department of the school is'sscience'");
	}
}
 class Nestedinter {
	public static void main(String[] args)
	{
		School s=new School();
		s.data();
		s.amount();
		s.dept();
	}
}