package vinaytest16;
public class Runnable {
		   public static void main(String[] args) {
		      Runnable r1 = new Runnable() {
		         public void run() { // anonymous class
		            System.out.println("Runnable with Anonymous Class");
		         }
		      };
		      java.lang.Runnable r2 =() -> {   // lambda expression
		         System.out.println("Runnable with Lambda Expression");
		      };
		      new Thread((java.lang.Runnable) r1).start();
		      new Thread(r2).start();
		   }
}	