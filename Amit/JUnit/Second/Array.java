package Second;
public class Array
{
	public static void main(String[] args)
	{
        int arr[] = {23,25,50,68,3};
        System.out.println(arrayLessThan(arr));
    }
    public static boolean arrayLessThan(int array[])
    {
        for (int element : array)
        {
            if(element>20)
            {
            	return true;
            }
        }
		return false;
   }
}