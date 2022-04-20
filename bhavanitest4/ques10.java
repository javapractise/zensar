class Student 
{
String name;
int roll_no;
public Student(String name,int roll_no)
{
this.name=name;
this.roll_no=roll_no;
}
}
class MainStudent
{
public static void main(String args[])
{
Student s=new Student("john",2);
System.out.println(s.name);
System.out.println(s.roll_no);
}
}
