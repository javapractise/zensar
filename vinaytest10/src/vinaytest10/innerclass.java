package vinaytest10;
class Outer_Demo {
	   int num;
	   // inner class
	   private class innerclass {
	      public void print() {
	         System.out.println("This is an inner class");
	      }
	   }
	   
	   void display_Inner() {
	      innerclass inner = new innerclass();
	      inner.print();
	   }
	}
class My_class {

	   public static void main(String args[]) {
	      Outer_Demo outer = new Outer_Demo();
	      outer.display_Inner();
	   }
	}