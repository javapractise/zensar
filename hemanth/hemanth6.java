package javapractice;

import java.util.Scanner;

public class stringreverse {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);

	String str =sc.next();


	divideString(str, 4);
	}

	static void divideString(String str, int n)
	{
		int string_size = str.length();
		int part_size;


		if (string_size % n != 0) {
			System.out.println("Invalid  String size"
								+ "is not divisible by n");
			return;
		}
		part_size = string_size / n;

			for (int i = 0; i < string_size; i++) {
				if (i % part_size == 0)
					System.out.println();
				System.out.print(str.charAt(i));
			}
		}
		
	}