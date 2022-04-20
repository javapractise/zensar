class Rectangle{
	int length;
	int breadth;
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public void printArea()
	{
		System.out.println("Area is :"+length*breadth);
	}
	public void printPerimeter()
	{
		System.out.println("Perimeter is :"+2*(length+breadth));
	}
}

class Square extends Rectangle{
	int s;
	Square(int s)
	{
		super(s,s);
	}
}

public class Fourth{
	public static void main(String[] args)
	{
		System.out.println("For Rectangle:");
		Rectangle r = new Rectangle(10, 20);
		r.printArea();
		r.printPerimeter();
		System.out.println("\n===================\n\nFor Square:");
		Square s = new Square(10);
		s.printArea();
		s.printPerimeter();
	}
}