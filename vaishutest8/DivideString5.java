package project1;

public class DivideString5 {


	
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

	
	public static void main(String[] args)
	{
		
		String str = "vaishnavi_badve";

		
		divideString(str, 5);
	}
}
