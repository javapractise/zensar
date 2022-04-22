class Rectangle {
	int length, breadth;

	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	public void area() {
		System.out.println("Area :" + length * breadth);
	}

	public void perimeter() {
		System.out.println("Perimeter :" + 2*(length + breadth));
	}

}

class Square extends Rectangle{
	public Square(int s) {
		super(s, s);
	}
}

public class Question1 {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(6, 5);
		r.area();
		r.perimeter();
		Square s = new Square(4);
		s.area();
		s.perimeter();

	}

}