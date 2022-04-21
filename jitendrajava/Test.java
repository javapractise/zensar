class A{
public void display()
{
System.out.println("this is display");
}
}
class B extends A{
void show(){
System.out.println("this is show");
}
}
public class Test{
public static void main(String[] args){
B obj=new B();
obj.display();
obj.show();
}
}