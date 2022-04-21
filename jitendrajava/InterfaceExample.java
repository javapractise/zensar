interface MyInterface{
public void demo();
public static void display(){
System.out.println("Static method");
}
}
public class InterfaceExample{
public void demo(){
System.out.println("Demo method");
}
public static void main(String[] main){
InterfaceExample obj=new InterfaceExample();
obj.demo();
MyInterface.display();
}
}

//static method
