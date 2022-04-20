class Animal2
{  
	void msg(){
		System.out.println("Hello");
	}
	
}  
class B
{  
	void msg(){
		System.out.println("Welcome");
	}
	  
}  
class C extends A,B{ 
   
 public static void main(String args[]){  
   C obj=new C();  
   obj.msg();  
}  
}  // multiple inheritance