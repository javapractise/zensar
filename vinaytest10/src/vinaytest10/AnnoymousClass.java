package vinaytest10;
	abstract class AnnoymousClass {
		   public abstract void mymethod();
		}

		 class Outer_class {

		   public static void main(String args[]) {
			   AnnoymousClass inner = new AnnoymousClass() {
		         public void mymethod() {
		            System.out.println("This is an example of anonymous inner class");
		         }
		      };
		      inner.mymethod();	
		   }
		}