class Member
{
String name;
int age;
double phoneno;
String address;
double salary;
public Member(String name,int age,double phoneno,String address,double salary)
{
this.name=name;
this.age=age;
this.phoneno=phoneno;
this.address=address;
this.salary=salary;
}
public void printsalary()
{
System.out.println("the salary of the members is:"+salary);
}
}
class Employee extends Member
{
String speci;
String dept;
