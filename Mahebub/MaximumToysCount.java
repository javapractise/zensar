package codeTest;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumToysCount {

	static int getMaxToys(int cost[], int length, int money) {
		int count = 0, sum = 0;

		Arrays.sort(cost);

		for (int i = 0; i < length; i++) {

			if (sum + cost[i] <= money) {
				sum = sum + cost[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cost[] = new int[n];
		int length = cost.length;
		for (int i = 0; i < length; i++) {
			cost[i] = scan.nextInt();
		}
		int money = scan.nextInt();

		System.out.print(getMaxToys(cost, length, money));
	}
}


/*
*
Input1:
7
1
4
5
3
2
1
6
6

Output1:
3
-----------------------
Input2:
8
2
1
4
6
2
1
8
5
9

Output2:
4
-----------------------
Input3:
10
2
4
5
7
8
6
11
4
1
9
18

Output3:
5
* 
* */