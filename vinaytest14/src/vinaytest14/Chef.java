package vinaytest14;

public class Chef extends Person {
@Override
public String speak() {
return super.speak() + "I love food";
		}
public static void main (String[] args) {
	Chef chef= new Chef();
	System.out.println(chef.speak());
}
}