public class StringIgnoreCase {

	public static void main(String[] args) {

		String s1 = "Subbarao Kalluri";
		String s2 = "subbarao kalluri";

		boolean check = s2.equalsIgnoreCase(s1);

		System.out.println(check);

	}

}