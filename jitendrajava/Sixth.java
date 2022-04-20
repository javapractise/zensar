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
class Rectangle extends Shape{
public void rectanglePrint(){
System.out.println("this is rectangular shape");
}
}
class Square extends Rectangle{
public void squarePrint(){
System.out.println("this is square shape");
}
}
public class Sixth{
public static void main(String main[]){
Square s=new Square();
s.rectanglePrint();
s.shapePrint();
}
}
