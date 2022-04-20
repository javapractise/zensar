package com.java.inherience;



 class Shape{
    public void princeShape(){
        System.out.println("This is a shape!");
    }
}
    class Rec extends Shape{
        public void printRectangle(){
            System.out.println("This is Ractangle ");
        }
    }
    class Circle extends Shape{
        public void printCricle(){
            
        }
    }
    class Square extends Rec{
        public  void printSqure(){
            System.out.println("Square is a rectangle");
        }
    }
    
  


public class OjectMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Square square = new Square();
		 square.princeShape();
		 square.printRectangle();
        
	}

}
