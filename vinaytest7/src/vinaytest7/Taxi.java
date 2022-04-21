package vinaytest7;

import java.util.Scanner;

public class Taxi {
	private static Scanner sc;

	public static void main(String[] args) {
		
		int total = 0;
		
		sc = new Scanner(System.in);
		int c = sc.nextInt();
		int d = sc.nextInt();

		int[][] a = new int[c+1][d+1];
		for(int i=0; i<d; i++) {
			for(int j=0; j<d; j++) {
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