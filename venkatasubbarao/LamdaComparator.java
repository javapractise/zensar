package javaprogram;

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

      list.add(new Employees(4155, "raju", 35000));
      list.add(new Employees(3256, "venu", 60000));
      list.add(new Employees(1123, "sudheer", 50000));
      System.out.println("Sorting the employee list based on the name");

      Collections.sort(list, (p1, p2) -> {
         return p1.name.compareTo(p2.name); 
      }); 
      for(Employees e : list) {
         System.out.println(e.id + " " + e.name + " " + e.salary);
      }
   }
}