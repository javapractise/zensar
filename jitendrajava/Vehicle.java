class Vehicle{
void run(){
System.out.println("running");
}
}
class Bike extends Vehicle{
void run(){
System.out.println("Bike is running");
}
public static void main(String[] args){
Bike obj=new Bike();
obj.run();
}
}