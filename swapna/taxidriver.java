import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {

		int total = 0;

		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] a = new int[m+1][n+1];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		for(int k=0; k<a.length; k++) {
			for(int l=0; l<a[k].length; l++) {
				if(a[k][l] != -1) {
					total = total + a[k][l];
				}
			}
		}

		System.out.println("Maximum number of passengers that can be collected are: "+total);

	}
}