class Rectangle1 {
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

public class Question2 {

	public static void main(String[] args) {

		int[] nums = {2, 4, 20, 24, 26, 10, 5, 12, 30, 8};

		for(int n: nums) {
			Square s = new Square(n);
			s.area();
		}


	}

}