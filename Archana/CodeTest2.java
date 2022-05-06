import java.util.*;
class CodeTest2{
	public static int getMaxToys(int prices[],int money){
		int sum=0;
		int count=0;
		int max=0;
		System.out.println("The amount is");
		for(int i=0;i<prices.length;i++){
			sum=count=0;

			for(int j=i;j<prices.length;j++){
				if((sum+prices[j])<=money){
					sum=sum+prices[j];
					count=count+1;
					max=Math.max(count,max);
				}
				else{
					count=0;
					sum=0;
					break;
				}
			}
		}
		return max;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int prices[]=new int[n];
		for(int i=0;i<n;i++)
		prices[i]=sc.nextInt();
		System.out.println("Enter the amount");
		int money=sc.nextInt();
		System.out.println(getMaxToys(prices,money));
	}
}







/*Output:


C:\Users\AG67741\Documents\zensar\Archana>javac CodeTest2.java

C:\Users\AG67741\Documents\zensar\Archana>java CodeTest2
Enter the no of elements
7
1
4
5
3
2
1
6
Enter the amount
6
The amount is
3
*/
