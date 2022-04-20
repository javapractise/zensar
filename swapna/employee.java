 class Employee{
	float salary = 40000;
}
class programmer extends Employee
{
	int bonus = 10000;
}
 class Inheritance{

	public static void  main(String args[]){
	programmer  p = new programmer();
	System.out.println("Programmer salary is:"+p.salary);  
    System.out.println("Bonus of Programmer is:"+p.bonus);
	}

}// single inheritance