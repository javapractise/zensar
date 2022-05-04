package javaprogram;

// DefaultMethod
interface Display{  
     
    default void disp(){  
        System.out.println("This is default method");  
    }  
     
    void dispHere(String msg);  
}  
public class DefaultMethod implements Display{  
    public void dispHere(String msg){        
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        DefaultMethod d = new DefaultMethod();  
        d.disp();  
        d.dispHere("Work done"); 
  
    }  
}  