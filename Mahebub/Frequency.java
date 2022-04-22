package stirngpractice;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int[] count = new int[s.length()];
		
		char[] ch = s.toCharArray();
		
		for(int i=0; i<s.length();i++) {
			count[i] = 1;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i] == ch[j]) {
					count[i]++;
					ch[j] = '0';
				}
			}
		}
		
		System.out.println("Frequency of character in the string");
		for(int i=0;i<count.length;i++) {
			if(ch[i] != ' '&&ch[i] != '0') {
				System.out.println(ch[i]+"="+count[i]);
			}
		}
	}

}
