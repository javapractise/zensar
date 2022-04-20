package vinaytest5;

class Calculation
{
	 public int add(int a,int b)
	 {
		 return a+b;
	 }
	 public int sub(int a, int b)
	 {
		 return a-b;
	 }
}
class derived1 extends Calculation
{
	public int multiply(int a, int b)
	{
		return a*b;
	}
	public void CallMethods()
	{
		System.out.println("Addition is "+add(3,4));
		System.out.println("Subtration is "+ sub(4,3));
		System.out.println("Multiplication is "+ multiply(2,3));
	}
}
class derived2 extends Calculation
{
	public int div(int a, int b)
	{
		return a/b;
	}
	public void CallMethods()
	{
		System.out.println("Addition is "+add(3,4));
		System.out.println("Subtration is "+ sub(4,3));
		System.out.println("Division is "+ div(4,2));
	}
}
class hInheritance
{
	public static void main(String args[])
	{
		derived1 d1 = new derived1();
		d1.CallMethods();
		derived2 d2 = new derived2();
		d2.CallMethods();
	}
}