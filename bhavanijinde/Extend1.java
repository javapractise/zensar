interface Employee
{
void salary(int i);
void dept ();
}
class Developer implements Employee
{

public int salary(int i)
{
System.out.println("salary:");
}
public void dept()
{
System.out.println("dept:");
}
}
class Extend1
{
public static void main(String args[])
{
Developer d=new Developer();
d.dept();
}
}