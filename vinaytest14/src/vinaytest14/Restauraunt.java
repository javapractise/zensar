package vinaytest14;

public class Restauraunt {
public void waiter() {
System.out.println("hi,What can I get for you?");	
}
public void manager() {
	System.out.println("Get your job done");
}
public void chef() {
	Chef chef=new Chef();
	System.out.println(chef.speak());
}
public static void main(String[] args) {
	Restauraunt rest=new Restauraunt();
	rest.waiter();
	rest.manager();
	rest.chef();
}
}