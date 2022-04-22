public class DivideString{
	public static void A(String str, int n){
		int a = str.length();
		int b;		
		if (a%n != 0) {
			System.out.println("Invalid  String size");
			return;
		}
		b=a/n;
		for (int i = 0; i < a; i++) {
			if (i % b == 0)
			System.out.println();
			System.out.print(str.charAt(i));
		}
	}

	
	public static void main(String[] args)
	{
		
		String str = "archanareddy";

		
		A(str, 5);
	}
}
