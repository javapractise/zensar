class Shape{
	public void ShapePrint(){
		System.out.println("This is shape");
	}
}
class Rectangle extends Shape{
	public void RectanglePrint(){
		System.out.println("This is rectangular shape");
	}
}
class Circle extends Shape{
	public void CirclePrint(){
		System.out.println("This is circular shape");
	}
}

class Square extends Rectangle{
	public void SquarePrint(){
		System.out.println("This is square shape");
	}
}


public class Sixth {
	public static void main(String args[]){
		Square s=new Square();
		s.ShapePrint();
		s.RectanglePrint();
	}

}
