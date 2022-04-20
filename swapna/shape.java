class Shape{
  public void print_shape(){
    System.out.println("This is shape");
  }
}


class Rectangle extends Shape{
  public void print_rect(){
    System.out.println("This is rectangular shape");
  }
}


class Circle extends Shape{
  public void print_circle(){
    System.out.println("This is circular shape");
  }
}


class Square extends Rectangle{
  public void print_square(){
    System.out.println("Square is a rectangle");
  }
}
class Test{
  public static void main(String[] args){
    Square obj = new Square();  
    obj.print_shape();    
    obj.print_rect();    
  }
}