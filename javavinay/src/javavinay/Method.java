package javavinay;

public class Method {
	public void parentmethod() {
		System.out.println("This is parent class");
	}
}
class Childclass extends Method{
	public void childclassmethod() {
		System.out.println("This is child class");
	}
}
class result {
	public static void main(String[] args) {
		Method a= new Method();
		Childclass b=new Childclass();
		a.parentmethod();
		b.childclassmethod();
		b.parentmethod();
	}
}