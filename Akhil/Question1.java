package training6;


public class Question1 {

	public static void main(String[] args) {
		
		int num1 = 22;
		
		// converting int into integer explicitly
		Integer num2 = Integer.valueOf(num1);
		
		// autoboxing it will write automatically Integer.valueOf(num1) for us
		Integer num3 = num1;
		
		System.out.println(num2);
		System.out.println(num3);

	}

}
