//nested interface
Package methods;

interface car{  
  void drive();  
  interface bike{  
   void ride();  
  }  
}  
class NestedInterface implements car.bike{  
 public void msg(){
System.out.println("both are vehicles");
}  
  
 public static void main(String args[]){  
  car.bike b1=new NestedInterface();  
  b1.msg();  
 }  
}  