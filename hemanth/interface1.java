interface animal{
	public void eat();
}
interface dog{
	public void sound();
}
class Rectangle implements animal,dog{
	public void eat(){
		System.out.println("pedegree");
	}
	public void sound(){
		System.out.println("bark");
	}
}

public class Multyinhe {
	public static void main(String args[]){
		Rectangle obj=new Rectangle();
		obj.eat;
		obj.sound;
	}

}