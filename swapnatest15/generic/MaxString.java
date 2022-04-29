
class MaxString
{
	static int arr[] = {10, 324, 45, 90, 9808};
	static int largest()
	{
		int i;
		
		
		int max = arr[0];
		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
	
		return max;
	}
		public static void main(String[] args)
		{
			System.out.println("Largest in given array is " + largest());
		}
}
//
C:\Users\SC67784\repo\SAMPLE>javac MaxString.java

C:\Users\SC67784\repo\SAMPLE>java MaxString.java
Largest in given array is 9808