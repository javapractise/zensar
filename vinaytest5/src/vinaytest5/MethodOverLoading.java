package vinaytest5;

public class MethodOverLoading {
	void sum(int a,int b) {
		int s=a+b;
		System.out.println("Sum of two"+s);
	}
	void sum(int a,int b,int c) {
		int t=a+b+c;
		System.out.println("sum of three"+t);
	}
	public static void main(String[] args) {
		MethodOverLoading a=new MethodOverLoading();
		a.sum(25,30);
a.sum(11,23,567);	

	}

}
