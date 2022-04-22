package project1;

public class CustomWrapper {


	  private int it;
	  
	  CustomWrapper(int i){
	    this.it = i;
	  }
	  
	  public int getValue() {
	    return it;
	  }
	  
	  public void setValue(int i) {
	    this.it = i;
	  }
	  
	  public String toString() {
	    return Integer.toString(it);
	  }
	}
	class CustomWrapperDemo {
	  public static void main(String[] args) {
		  CustomWrapper w = new CustomWrapper(30);
	    w.setValue(50);
	    System.out.println(w.getValue());
	    System.out.println(w);
	  }
	}