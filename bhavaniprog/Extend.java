class Object {

    String name;
    int age;
    String dept;
    Object(String name, int age, String dept)
    {
       
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
}
class Extend{
 
  
    public static void main(String args[])
    {
 
      
        Object b1 = new Object("Snow", 21,"develpoer");
        Object b2 = new Object("tom", 23,"develpoer");
        Object b3 = new Object("jessy", 25,"develpoer");
        System.out.println(b1.equals(b2));
    }
}