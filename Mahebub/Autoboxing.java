package stirngpractice;

public class Autoboxing {

	public static void main(String[] args) {
		int a = 20;
		Integer i = Integer.valueOf(a);
		Integer j = a;
		System.out.println("This is a autoboxing of primitive data type int a="+a+" to object wrapper class Integer j="+j);
	}

}
