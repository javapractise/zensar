package oops;

public class mainclass {
 void parent()
	{
		System.out.println("this is parent class");
	}

	public static void main(String[] args) {
	mainclass sc=new mainclass();
	sc.parent();

	}

}





package oops;

public class subclass extends mainclass {
	void child()
	{
		System.out.println("this is child class");
	}

	public static void main(String[] args) {
		subclass sc1=new subclass();
		sc1.child();
		sc1.parent();
		
	}

}                     