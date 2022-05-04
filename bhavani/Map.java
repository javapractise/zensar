import java.util.ArrayList;
import java.util.List;
public class Map
{
public static void main(String args[])
{
List<Employee>people=new ArrayList<>();
people.add(new Employee(101,"bhavani",21));
people.add(new Employee(102,"surya",23));
people.add(new Employee(103,"sai",24));
double avg=calavg(people);
System.out.println("average age of employee:"+avg);
avg=avg(people);
System.out.println("average age of employee:"+avg);
}
private static double calavg(List<? extends Employee> employees){
        int totalEmployee = employees.size();
        double sum = 0;
        for(Employee e : employees){
            sum += e.getAge();
        }
       
        double avg = sum/totalEmployee;
        return avg;
    }
private static double avg(List<?extends Employee>people)
{
return people.stream().mapToInt(p-> p.getAge())
.avg()
.getAsDouble();
}
}
class Employee
{
private final int id;
private final String name;
private final int age;
public Employee(int id,String name,int age)
{
this.id =id;
this.name=name;
this.age=age;
}
public int getId()
{
return id;
}
public String getName()
{
return name;
}
public int getAge()
{
return age;
}
}