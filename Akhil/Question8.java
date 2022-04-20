package training2;

class Rectangle3 {
	int length, breadth;
	
	public Rectangle3(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public void area() {
		System.out.println("Area :" + length * breadth);
	}
	
}

public class Question8 {

	public static void main(String[] args) {
		
		// creating objects
		Rectangle3 r1 = new Rectangle3(4, 5);
		Rectangle3 r2 = new Rectangle3(5, 8);
		
		// calling methods
		r1.area();
		r2.area();

	}

}
