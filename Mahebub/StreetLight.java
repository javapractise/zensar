package codingassignment;

import java.util.Scanner;

public class StreetLight {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int location[]=new int[n];
		for(int i=0;i<n;i++) {
			location[i]=scan.nextInt();
		}
		
		int i=0,ans=0;
		while(i<n) {
			int j=i+a-1;
			while(j>=i-a+1 && j>=0 && j<=n) {
				if(location[j]==1) {
					ans++;
					i=j+a;
					break;
				}
				j--;
			}
		}
		System.out.println(ans);
	}
}