package training9;

public class ArithmeticException {

	public static void main(String[] args) {
		
		try {
			int a = 5 / 0;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
