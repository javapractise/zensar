package javavinay;

public class Six {
		public Six(){
			System.out.println("This is shape");
		}

	class Rectangle extends Six{
		public void RectanglePrint(){
			System.out.println("This is rectangular shape");
		}
	}
	class Circle extends Six{
		public void CirclePrint(){
			System.out.println("This is circular shape");
		}
	}

	class Square extends Rectangle{
		public void SquarePrint(){
			System.out.println("This is square shape");
		}
	}


	class Sixth {
		public static void main(String args[]){
			Six =new Square();
			s.SixPrint();
			s.RectanglePrint();
		}
}