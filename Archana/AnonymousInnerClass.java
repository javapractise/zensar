class Nested 
//it can be anything interface or normal class 
{
	void methodmested()
	{
		System.out.println("nesteded");
		
		
	}
	
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
	Nested n=new Nested();
	n.methodmested();
	}

}