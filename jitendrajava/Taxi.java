import java.util.*;
public class Taxi{
	public static void main(String[] args) {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] a = new int[m+1][n+1];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int k=0; k<a.length; k++) {
			for(int l=0; l<a[k].length; l++) {
				if(a[k][l] != -1) {
					total = total + a[k][l];
				}
			}
		}
		
		System.out.println("These are the Total Passengers traveled from Taxi: "+total);
		
		}
}