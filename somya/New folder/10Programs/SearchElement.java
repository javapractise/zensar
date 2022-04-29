import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(3);
		arr.add(5);
		arr.add(2);
		arr.add(7);
		arr.add(0);
		arr.add(6);
		
		boolean check = arr.contains(n);
		
		if(check) {
			System.out.println("Element " + n + " found at position " + arr.indexOf(n) + " in array.");
		} else {
			System.out.println("Not Found.");
		}

	}

}