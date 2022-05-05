package vinaytest16;

public class Employee{
	  private String name;
	  private Integer age;
	  public Employee(String name, Integer age){
	    this.name=name;
	    this.age=age;
	  } 
	  //--getters/setters for name and age go here  
	  public String toString(){
	    return "Employee Name:"+this.name
	      +"  Age:"+this.age;
	  }
	  @Override
	  public boolean equals(Object obj) {
	     if (obj == this) {
	       return true;
	     }
	     if (!(obj instanceof Employee)) {
	       return false;
	     }
	     Employee empObj = (Employee) obj;
	       return this.age==empObj.age
	         && this.name.equalsIgnoreCase(empObj.name);
	  }
	  @Override
	  public int hashCode() {
	    int hash = 1;
	    hash = hash * 17 + this.name.hashCode();
	    hash = hash * 31 + this.age;
	    return hash;
	  }
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	}