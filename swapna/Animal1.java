class Animal1 
{
   interface Activity 
   {
      void move();
   }
}
class Dog implements Animal1.Activity 
{
   public void move() 
   {
      System.out.println("Dogs can walk and run");
   }
}
public class NestedInterface 
{
   public static void main(String args[])
   {
      Dog dog = new Dog();
      dog.move();
   }
}

