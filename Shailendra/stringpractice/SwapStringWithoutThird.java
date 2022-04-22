
public class SwapStringWithoutThird {

	public static void main(String[] args) {
		String s ="s";
		String p ="p";
		s =s+p;
		p=s.substring(0,(s.length()-p.length()));
		s =s.substring(p.length());
		System.out.println(s+"value is String First ");
		System.out.println(p+"value of second String");
		
	}

}
