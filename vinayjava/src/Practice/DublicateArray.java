package Practice;

public class DublicateArray {
public static void main(String[] args) {
		
		int[] arr = {1,5,6,12,11,5,5,12};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}