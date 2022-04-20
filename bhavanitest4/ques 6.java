class Shape
{
public void shape()
{
 System.out.println("this is a shape");
}
}
class Rectangle extends Shape
{
public void rect()
{
 System.out.println("this is a rectangle");
}
}
class Circle extends Shape
{
public void cir()
{
 System.out.println("this is a circular shape");
}
}
class Square extends Rectangle
{
public void squa()
{
 System.out.println("square is a rectangle");
}
}
class Test
{
public static void main(String args[])
{
Square sq=new Square();
sq.shape();
sq.rect();
}
}