package Interface;
public interface Employee {
String name="hemanth";
int age=22;
void print() ;
}

class Person implements Employee {
	public void print() {
		System.out.println("excellent");
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.print();	}
}