package vinaytest5;

public class multilevel {
	int number =10;
	void show() {
		System.out.println("number="+number);
	}
	}
class B extends multilevel{
	int b=10;
	 void show() {
		System.out.println("number2="+b);
	}
}
class C extends B{
	public static void main(String[] args) {
		C c=new C();
		c.show();
		B b= new B();
		b.show();
	}
}
