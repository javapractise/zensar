interface MyInterface{
public default void display(){
System.out.println("default method");
}
}
public class InterfaceExampleDe implements MyInterface{
public static void main(String[] main){
InterfaceExampleDe obj=new InterfaceExampleDe();
obj.display();
}
}

// default method