interface Car
{
void speed();
}
interface Bike extends Car
{
void milege();
}
class Vehicle implements Bike
{
public void speed()
{
System.out.println("speed of the car");
}
public void milege()
{
System.out.println("bike milege");
}
}
class InterfaceExtends
{
public static void main(String args[])
{
Vehicle v=new Vehicle();
v.speed();
v.milege();
}
}