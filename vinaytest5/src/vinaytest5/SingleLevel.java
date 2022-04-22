package vinaytest5;

public class SingleLevel {
	int number =10;
	void show() {
		System.out.println("number="+number);
	}
	}
class Number extends SingleLevel{
	public static void main(String[] args) {
		Number b=new Number();
		b.show();

	}

}
