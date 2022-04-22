package vinaytest5;

public class MethodOverriding {
	 public int add(int a, int b)
	 {
		 return a+b;
	 }
}
class base extends MethodOverriding{
	 public int add(int a, int b)
	 {
		 return a+b+10;
	 }
	 public static void main(String args[])
	 {
		 MethodOverriding b = new MethodOverriding();
		 System.out.println(b.add(4,5));
		 base mo = new base();
		 System.out.println(mo.add(4,5));
	 }
}