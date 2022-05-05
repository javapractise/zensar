interface EvenOdd {
	void check(int a);
}

public class LambdaExample1 {
	public static void main(String[] args) {
		// Lambda Expression
		EvenOdd evenOdd = (int a) -> {
			if(a%2==0){
				System.out.println("Number "+a+" is even.");
			}else{
				System.out.println("Number "+a+" is odd.");
			}
		};

		//Check numbers
		evenOdd.check(21);
		evenOdd.check(12);
	}
} 