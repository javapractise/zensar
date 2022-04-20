class Rectangle
{
int length;
int width;
public Rectangle(int length,int width)
{
this.width=width;
this.length=length;
}
public double area()
{

return length*width;
}
}
class MainRec
{
public static void main(String args[])
{
Rectangle r=new Rectangle(4,5);
Rectangle r1=new Rectangle(4,5);
System.out.println(r.area());
System.out.println(r1.area());


}
}

