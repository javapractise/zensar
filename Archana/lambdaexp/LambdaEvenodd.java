interface EvenOdd {
	void check(int n);
}

public class LambdaEvenodd {
	public static void main(String[] args) {
		// Lambda Expression
		EvenOdd evenOdd = (int n) -> {
			if(n%2==0){
				System.out.println("Number "+n+" is even.");
			}else{
				System.out.println("Number "+n+" is odd.");
			}
		};
		
		//Check numbers
		evenOdd.check(5);
		evenOdd.check(8);
	}
}