
public class RemoveWhiteSpace {
public static void main(String[] args) {
	String s ="hey there somthing   ";
	s =s.replaceAll("\\s", "");
	System.out.println(s);
}
}
