//multi level inheritance real time example

class Car
{
public void car()
{
 System.out.println("car is a vehicle");
}
}
class Bmw extends Car
{
public void Speed()
{
 System.out.println("max:90kmph");
}
public void colour()
{
 System.out.println("the car colour is black");
}
}
class Maruti extends Bmw
{
public void speed()
{
System.out.println("max:80kmph");
}
}
class MainCar
{
public static void main(String args[])
{
Maruti m=new Maruti();
m.speed();
m.colour();
m.car();
}
}
