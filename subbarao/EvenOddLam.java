interface EvenOdd {

	void check(int n);
}

public class EvenOddLam {

	public static void main(String[] args) {

		EvenOdd ref = (int num) -> {

			String result = "";

			if(num%2 == 0) {
				System.out.println("Even Number");
			} else {
				System.out.println("Odd Number");
			}

		};

		ref.check(4);


	}

}