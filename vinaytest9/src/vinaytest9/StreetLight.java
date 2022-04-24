package vinaytest9;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StreetLight {

	Integer a;
	Integer b;
	StreetLight(){
		
	}
	
	StreetLight(Integer a,Integer b){
	this.a=a;
	this.b=b;
	}
	
	public Integer getA() {
		return a;
	}
	
	public void setA(Integer a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
}

class SortingPair implements Comparator< StreetLight>{
	public int compare( StreetLight o1,  StreetLight o2) {
		if(o1.getA()==o2.getA()) {
			if(o1.getB()<o2.getB()) {
				return 1;
			}else {
				return 0;
			}
		}
		if(o1.getA()<o2.getA()) {
			return 1;
		}else {
			return 0;
		}
	}
}
 class Application2 {
	private static Scanner sc;
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int location[]=new int[n];
		for(int i=0;i<n;i++) {
			location[i]=sc.nextInt();
		}
		System.out.println(solve(location,n));
	}
	private static int solve(int[] location, int n) {
		StreetLight  range[] = new StreetLight [n];
		for(int i=0;i<n;i++) {
			int id=i+1;
			range[i] = new StreetLight ();
			range[i].setA(Math.max(1, id-location[i]));
			range[i].setB(Math.min(n, id+location[i]));
		}
		Arrays.sort(range,new SortingPair());
		int i=0,ans=0;
		while(i<n) {
			StreetLight  p=range[i];
			ans++;
			while(i+1<n && range[i].getA()==range[i+1].getA()) {
				p.b=Math.max(p.getB(), range[i+1].getB());
				i++;
			}
			while(i<n && range[i].getB()<=p.getB()) {
				i++;
			}
		}
		return ans;
	}
}