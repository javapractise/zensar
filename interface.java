package practice;
interface shape{
	public void rect();
}
class Rectangle implements shape{
	public void rect(){
		System.out.println("is in rectangle shape");
	}
}
public class Main {
	public static void main(String args[]){
		Rectangle obj=new Rectangle();
		obj.rect;
	}

}