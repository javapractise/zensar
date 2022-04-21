//Multiple
package test6vinay;
public interface Accelerate {
	  public void acceleratemethod();
	}
	interface Brake {
	  public void brakemethod();
	}
	class Car implements Accelerate,
	Brake {
	  public void brakemethod() {
	    System.out.println("This car has disc brakes");
	  }
	  public void acceleratemethod() {
	    System.out.println("This car has BENZ OM654 engine with 503 HP");
	  }
	}
	class MultipleInheritance {
	  public static void main(String[] args) {
	    Car carobject = new Car();
	    carobject.acceleratemethod();
	    carobject.brakemethod();
	  }
	}