package Practice;
import java.util.*;
public class ascendingorder {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the length:");
				int length = sc.nextInt();
				int[] arr = new int[length];
				for(int i=0 ; i<length ; i++)
				{	
					arr[i] = sc.nextInt();
				}
				int temp=0;
				for(int i=0 ; i<length;i++)
				{
					for(int j=i+1 ; j<length; j++)
					{
						if(arr[i] > arr[j])
						{
							temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}	
					}
				}
				System.out.println("Sorted array:");
				for(int i=0 ; i< length;i++)
				{
					System.out.print(arr[i]+"\t");
				}
			}

		}