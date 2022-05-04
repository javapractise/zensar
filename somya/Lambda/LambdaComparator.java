import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employees {
   int id;
   String name;
   double salary;
   public Employees(int id, String name, double salary) {
      super();
      this.id = id;
      this.name = name;
      this.salary = salary;
   }
}
public class LambdaComparator{
   public static void main(String[] args) {
      List<Employees> list = new ArrayList<Employees>();

      list.add(new Employees(115, "Somya", 2500));
      list.add(new Employees(125, "Neha", 3000));
      list.add(new Employees(135, "Veer", 4000));
      System.out.println("Sorting the employee list based on the name");

      Collections.sort(list, (p1, p2) -> {
         return p1.name.compareTo(p2.name); 
      }); 
      for(Employees e : list) {
         System.out.println(e.id + " " + e.name + " " + e.salary);
      }
   }
}