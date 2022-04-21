package test6vinay;

public interface DefaultStatic {
		   default void show() {
		      System.out.println("In  default method ");
		   }
		   static void display() {
		      System.out.println("In DefaultStaticExampleInterface I");
		   }
		}
          class DefaultStaticClass implements DefaultStatic{
		}
 class Main {
		  public static void main(String args[]) {
		      DefaultStatic.display();
		      DefaultStaticClass defaultStaticExampleClass = new DefaultStaticClass();
		      defaultStaticExampleClass.show();
		   }
		}