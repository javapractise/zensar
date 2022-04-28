interface Employee
{
void emp_details()

interface Basic
{
void salary();
double sal=5000.00;
}
}
class Test implements Employee.Basic
{
public static void main(string args[])
{
Employee.Basic eb=new Test();
eb.salary();
}