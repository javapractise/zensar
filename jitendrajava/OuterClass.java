//InnerClass

package javaprogram;

public class OuterClass {

			int x=10;
		

		public class InnerClass {
			int y=5;
		}
		}
		
		public class Main {

			public static void main(String[] args) {
				OuterClass myOuter=new OuterClass();
				OuterClass.InnerClass myinner= myOuter.new InnerClass();
				System.out.println(myInner.y + myOuter.x);
			}
			}
