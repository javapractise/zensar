package training4;

interface Animal {
	public void getName();
	public void getSound(String sound);
}

class Dog implements Animal {
	
	public void getName() {
		System.out.println("This is a dog.");
	}
	
	public void getSound(String sound) {
		System.out.println("Dog say's " + sound);
	}
}

public class Interface {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		d.getName();
		d.getSound("bow bow");

	}

}
