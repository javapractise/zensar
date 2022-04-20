package training2;

class Triangle {
	int s1, s2, s3;
	
	public void area() {
		double x = (s1 + s2 + s3) / 2;
		double a = (x * (x - s1) * (x - s2) * (x - s3)) ;
		
		System.out.println("Area of Traingle is:" + a);
	}
}

public class Question7 {
	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		t.s1 = 5;
		t.s2 = 6;
		t.s3 = 7;
		
		// calling method
		t.area();
	}
}
