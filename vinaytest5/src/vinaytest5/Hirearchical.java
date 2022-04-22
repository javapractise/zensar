package vinaytest5;

public class Hirearchical {
		int number =10;
		void show() {
			System.out.println("number="+number);
		}
		}
	class D extends Hirearchical{
		int d=10;
		 void show() {
			System.out.println("number2="+d);
		}
	}
	class E extends Hirearchical{
		public static void main(String[] args) {
			E e=new E();
			e.show();
			D d= new D();
			d.show();
	        
		}
	}