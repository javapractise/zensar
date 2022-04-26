package exception;

public class ArrayIndex {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum = 0;
		try {
			for(int i=0;i<=a.length;i++) {
				sum = sum + a[i];
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception Occurred");
			e.printStackTrace();
		}
	}
}
