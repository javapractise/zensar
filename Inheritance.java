package project1;



public class Inheritance {


	public void ParentMethod()
	{
		
		System.out.println("this is parent class");
	}
	
	}
 class Child extends  Inheritance{
	public void ChildMethod() {
		System.out.println("this is child class");
	
	}
	
}

 class Inheritance1{
	
	 public static void main(String[] args)  {
		
		Inheritance p=new Inheritance();
		Child c=new Child();
		p.ParentMethod();
		c.ParentMethod();
		c.ChildMethod();
	}
}


