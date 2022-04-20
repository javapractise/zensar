package project1;

 class Rectangle {
	
	int length,breadth;  
	public Rectangle(int l, int b) 
	      { 
		      length = l;  
	         breadth = b; 
	      }
	
	
	void print_area() 
	{  
		System.out.println(length*breadth); 
	}
	
	void print_perimeter()   
    	{   
		System.out.println(2*(length+breadth));
		}
}

class Square extends Rectangle 
{ 
  public Square(int s) { 
	  super(s, s); 
	  }       
  }
 class Result1 { 
	public static void main(String[] args) {
		Rectangle r = new Rectangle (4,5);
		Square s = new Square (4);  
		r.print_area();
		r.print_perimeter();
		s.print_area();
		s.print_perimeter(); 
		}
	}

