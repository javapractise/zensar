package practice2;


public class One {
	public static void main(String args[]){
		class A{
			void parent(){
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
		b.parent();
	}
}
