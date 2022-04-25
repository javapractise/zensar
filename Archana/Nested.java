class OuterClass
{
	public OuterClass() {
	System.out.println("outer class");
	}
	class InnerClass
	{
		public InnerClass() {
		System.out.println("innner class");
		}
	}
}


public class Nested {

	public static void main(String[] args) {
		OuterClass o =new OuterClass();
		
		OuterClass.InnerClass i =o.new InnerClass();
				
	}

}