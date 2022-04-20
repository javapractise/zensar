package practice2;

public class Two {
	public static void main(String args[]){
		class A{
			private void parent(){
				System.out.println("This is parent class");
			}
		}
		class B extends A{
			void child(){
				System.out.println("This is child class");
			}
		}
		A a=new A();
		a.parent();
		B b=new B();
		b.child();
		b.parent(); //errror
	}

}
