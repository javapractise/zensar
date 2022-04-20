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
int side;
public Square(int s)
{
 super(s,s);
}
}
public class Main10
{
public static void main(String args[])
{
Rectangle r=new Rectangle(10,5);
r.area();
r.perimeter();
Square s=new Square(4);
s.area();
s.perimeter();
Square [] a= new Square[10];
int K=5;
for(int i=0;i<=10;i++)
{
a[i]=new Square(K);
K++;
}
for(int i=0;i<=10;i++)
{
a[i].area();
a[i].perimeter();
}



}
}