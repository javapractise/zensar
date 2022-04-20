package practice;

public class student {
	String name="null";
	int roll_no;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public static void main(String[] args) {
		student obj=new student();
		obj.setRoll_no(2);
		obj.setName("john");
		System.out.println(obj.name);
		System.out.println(obj.roll_no);
		

	}


}
