 class Rectangle
{
private double length;
private double breadth;
public Rectangle(double length,double breadth)
{
this.length=length;
this.breadth=breadth;
}
public void area()
{
System.out.println(breadth*length);
}
public void perimeter()
{
System.out.println(2*(breadth+length));
}
}
class Square extends Rectangle
{
public Square(double side)
{
 super(side,side);
}
}
public class MainSize
{
public static void main(String args[])
{
Rectangle r=new Rectangle(10,5);
Rectangle s=new Square(10);
r.area();
r.perimeter();
System.out.println();
s.area();
s.perimeter();
}
}