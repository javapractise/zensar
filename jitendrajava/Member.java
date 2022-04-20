class Member{
String Name;
int age;
String number;
String address;
int salary;
public void printSalary()
{
System.out.println(salary);
}
}
class Employee extends Member{
String specialization;
}
class Manager extends Member
{
String department;
}
class test{
public static void main(String[] main){
Employee e=new Employee();
e.Name= "jkg";
e.age=23;
e.number="123455667";
e.address="mumbai";
e.salary=11111;
e.specialization="cs";
Manager m=new Manager();
m.Name= "vg";
m.age=22;
m.number="923455667";
m.address="hyd";
m.salary=21111;
m.department="ece";
}
}