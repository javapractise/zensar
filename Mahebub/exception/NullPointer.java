package exception;

public class NullPointer {

	public static void main(String[] args) {
		String s = null;
		String a = "abc";
		try {
			if(s.equals(a)) {
			System.out.println("Strings are equal");
			} else {
				System.out.println("Not equal");
			}
		} catch(NullPointerException e) {
			System.out.println("Null pointer exception occurred.");
			e.printStackTrace();
		}
	}

}
