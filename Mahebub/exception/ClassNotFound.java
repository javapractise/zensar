package exception;

public class ClassNotFound {
	public static void main(String[] args) {
		try {
			Class.forName("JavaProgramming");
		} catch(ClassNotFoundException e) {
			System.out.println("ClassNotFound Exception occurred.");
			e.printStackTrace();
		}
	}
}
