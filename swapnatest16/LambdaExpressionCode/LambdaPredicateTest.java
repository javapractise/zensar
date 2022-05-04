class LambdaPredicateTest
 {
   public static void main(String args[]) 
   {
      Employee emp1 = new Employee("swapna", 24);
      Employee emp2 = new Employee("roja", 33);
      Employee emp3 = new Employee("shalini", 30);

      List<Employee> empList = new ArrayList<Employee>();
      empList.add(emp1);
      empList.add(emp2);
      empList.add(emp3);

      Predicate<Employee> predicateForAge = (e) -> e.age >= 25;
      Predicate<Employee> predicateForName = (e) -> e.name.startsWith("S");
      for(Employee emp : empList) {
         if(predicateForAge.test(emp)) {
            System.out.println(emp.name +" is eligible by age");
         }
      }
      System.out.println("----------------------------");
      for(Employee emp : empList) {
         if(predicateForName.test(emp)) {
            System.out.println(emp.name +" is eligible by name");
         }
      }
   }
}


class Employee {
   public String name;
   public int age;
   public Employee(String name,int age){
      this.name=name;
      this.age=age;
   }
}