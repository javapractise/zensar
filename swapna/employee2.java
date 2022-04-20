 class Employee{  //multilevel inheritance
	float salary = 40000;
}
class programmer extends Employee
{
	int bonus = 10000;
	
}
class  empid extends Employee
{ 
	int id = 67784;

}
class emplocation extends Employee
{
		String  emplocation ="hyderbad";
}
 class Inheritance{

	public static void  main(String args[]){
	programmer  p = new programmer();
	empid       p = new  empid();
	emplocation p =new  emplocation();
	System.out.println("Programmer salary is:"+p.salary);  
    System.out.println("Bonus of Programmer is:"+p.bonus);
	System.out.println("emp id  is:"+d.id);
	System.out.println("emplocation is :"+p.emplocation)
	
	}

}