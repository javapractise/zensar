interface Employee
{
//default method
default String name()
{
System.out.println("the employee name is:");
return "somya";
}
//abstract method
double empsal(String sal);
//static method
static String empdept(String dept)
{
System.out.println(dept);
return "developer & tester";
}
}
public class EmpDetails implements Employee
{
public double empsal(String sal)
{
System.out.println(sal);
return 60000.00;
}
public static void main(String args[])
{
EmpDetails dm=new EmpDetails();
System.out.println(dm.name());
System.out.println(dm.empsal("employee salary:"));
System.out.println(Employee.empdept("employee department:"));
}
}