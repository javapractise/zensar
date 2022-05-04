package vinaytest16;
public interface EvenOdd {
		@FunctionalInterface
		interface EO {		
			void check(int n);
		}
	public class EvenOddLam {
		public static void main(String[] args) {	
			EO ref = (int num) -> {			
				String result = "";		
				if(num%2 == 0) {
						System.out.println("Even Number");
					} else {
						System.out.println("Odd Number");
					}			
				};
				
				ref.check(5);
			}
		}
	}