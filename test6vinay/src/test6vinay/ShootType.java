
package test6vinay;
interface ShootType {
 void shoot();
	}
	class Father implements ShootType {
	  public void shoot() {
	    System.out.println("I am the father and I shoot with my right hand!");
	  }
	}
	class Son implements ShootType {
	  public void shoot() {
	    System.out.println("I am the son. My father uses the right hand to shoot. I use my left hand to shoot!");
	  }
	}
class InterfacesJava {
	  public static void main(String[] args) {
	    Father f = new Father();
	    Son s = new Son();
	    f.shoot();
	    s.shoot();
	  }
	}