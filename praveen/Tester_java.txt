public class Animal {
	interface Example {
		void move();
		
	}
}

class dog implements Animal.Example {
	public void move() {
		System.out.println("dog can walk and run");
	}
}

public class Tester {

	public static void main(String[] args) {
		Dog d=new Dog();
		d. move();

	}

}