package javapractice;

public class Classloader {

	public static void main(String[] args) {
		Class c  =Classloader.class;
		System.out.println(c.getClassLoader());
	}
}

