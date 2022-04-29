package codingassignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TypeOfInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int c;
		ArrayList list = new ArrayList();
		for (int i = 1; i <= T; i++) {
			c = scan.nextInt();
			if (c == 1) {
				String s = scan.next();
				list.add(s);
			} else if (c == 2) {
				int a = scan.nextInt();
				list.add(a);
			}
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Object a = itr.next();
			System.out.println(a.getClass().getSimpleName());
			System.out.println(a);
		}
	}
}
