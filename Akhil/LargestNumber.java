package training;

public class LargestNumber {

	public static void main(String[] args) {

		int[] arr = {2, 5, 3, 6, 10, 7, 1};
		int largestNumber = arr[0];

		for(int num: arr) {
			if(num > largestNumber) {
				largestNumber = num;
			}
		}
		
		System.out.println("Largest Number is "+ largestNumber);
	}

}
