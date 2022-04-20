package project1;

class Shape{
public void shapePrint(){
System.out.println("this is shape");
}
}
class Circle extends Shape{
public void circlePrint(){
System.out.println("this is circular shape");
}
}
class Rectangle2 extends Shape{
public void rectanglePrint(){
System.out.println("this is rectangular shape");
}
}
class Square2 extends Rectangle2{
public void squarePrint(){
System.out.println("this is square shape");
}
}
 class Sixth{
public static void main(String main[]){
Square2 s=new Square2();
s.rectanglePrint();
s.shapePrint();
}
}