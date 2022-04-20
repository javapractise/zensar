class Test
{
 private void fly()
  {
    System.out.println("this is parent class");
  } 
}
class Test1 extends Test
{
public void wish()
  {
    System.out.println("this is child class");
  } 
}
class Main
{
 public static void main(String args[])
  {
    Test t=new Test();
    t.fly();
    Test1 t1=new Test1();
    t1.wish();
    t1.fly();
 }
}