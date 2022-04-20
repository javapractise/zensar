import java.util.Scanner;
class Average{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double sum=0;
		for(int i=0 ; i<10 ; i++)
		{
			sum += sc.nextInt();
		}
		double avg = sum/10;
		System.out.println("Average is :"+avg);
	}
}