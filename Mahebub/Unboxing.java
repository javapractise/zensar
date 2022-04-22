package stirngpractice;

public class Unboxing {
	public static void main(String[] args) {
		Integer i = new Integer(50);
		int a = i.intValue();
		int b = i;
		System.out.println("This is a unboxing of object wrapper class Integer i="+i+" to primitive datatype int b="+b);
	}
}
