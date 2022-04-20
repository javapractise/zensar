class Shape{
	public void shapePrint(){System.out.println("This is Shape");}
}

class Circle extends Shape{
	public void circlePrint(){System.out.println("This is Circular Shape");}
}

class Rectangle extends Shape{
	public void rectanglePrint(){System.out.println("This is Rectangular Shape");}
}

class Square extends Rectangle{
	public void squarePrint(){System.out.println("Square is a Rectangle");}
}

public class Sixth{
	public static void main(String[] args)
	{
		Square s = new Square();
		s.rectanglePrint();
		s.shapePrint();
	}
}