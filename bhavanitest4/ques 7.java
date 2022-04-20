class Triangle
{
int l,b,w;
public double area()
{
double s=(l+b+w)/2.0;
return Math.pow((s*(s-l)*(s-b)*(s-w)),5);
}
public double perimeter()
{
return(l+b+w)/2.0;
}
}
class MainTriangle
{
public static void main(String args[])
{
Triangle t=new Triangle();
t.l=3;
t.b=4;
t.w=5;
System.out.println(t.area());
System.out.println(t.perimeter());
}
}

