package training;

public class ArrayCopy {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] copyArr = arr;
		
		System.out.println("Original Array:");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		System.out.println("Duplicate Array:");
		
		for(int num: copyArr) {
			System.out.print(num + " ");
		}
	}
}
