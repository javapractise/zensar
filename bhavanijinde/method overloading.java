//method overloading real time example
class Employee
{
public double salary()
{
System.out.println("the employee salary");
return 20000.00;
}
public String salary(int i)
{

return "bhavani";
}
}
class Training
{
public static void main(String args[])
{
Employee e=new Employee();
System.out.println(e.salary(20));
System.out.println(e.salary());
}
}



