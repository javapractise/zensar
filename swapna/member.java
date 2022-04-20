class member{
	String name;
	int  age;
	String number;
	String address;
	int salary;
	public void printSalary(){
		System.out.println("salary");
	}
}
	class employee extends member{
	    String specialization;
	}
	class manager extends member{
	   String  department;
	class Solution{
		public static void main (String args[]){
		  employee e =new employee();
		   e.name = "swapna";
		   e.age = 24;
		   e.number = 898989;
		   e.address = "tirupathi";
		   e.salary = 30000;
		    e.specialization = "developer";
		manager m = new manager();
		m.name = "mukand";
		m.age = 45;
		m.number = 7867678;
		m.address = "pune";
		m.salary = 97000;
		m.specialization = "hr";

		}
	     }
	
      }



	