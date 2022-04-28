import java.util.* ;

class IdGenerator{
	public static void main(String[] args)
	{
		// to take input from user
		Scanner z = new Scanner(System.in);
		String str = z.next();

		// Arrray to store generated id
		String[] idArr = new String[findLength(str.length())];

		// Array to store string
		String[] strArray = generateString(str);

		// To generate ID for each string 
		int temp = 0;
		for(int i=0 ; i< strArray.length;i++)
		{
			// Tempopary array to store the generated id's
			String[] tempArr = generateID(strArray[i]);
			
			for(int j=0 ; j < tempArr.length ; j++)
			{
				// copy the generated id's into the idArray
				idArr[temp] = tempArr[j];
				temp++ ;
				
			}
		}
		// To sort thearray in Ascending order
		Arrays.sort(idArr);
		

		// To print the final Answer 
		System.out.println(idArr[idArr.length-1]);
	}
	// Method to find the lengt for array to strore all the id's
	public static int findLength(int length)
	{
		int num = 1;
	
		for(int i=2 ; i <= length ; i++)
		{
			num += i ; 
		}
		return num;
	}
	// Method to generate string by removinf first letter
	public static String[] generateString(String str)
	{
		String[] str1 = new String[str.length()];
		String temp = "";
		for(int i = 0 ; i < str.length(); i++)
		{
			for(int j = i ; j < str.length(); j++)
			{
				temp  = temp + str.charAt(j);
			}
			str1[i] = temp;
			temp = "";
		}
		return str1;
	}
	// Method to generate Id's for given string
	public static String[] generateID(String str)
	{
		String[] idArray = new String[str.length()];
		String temp = "";
		for(int k = 0 ; k < str.length() ; k++)
		{
			for(int l=0 ; l <= k ; l++)
			{
				temp = temp + str.charAt(l);
			}
			idArray[k] = temp;
			temp = "";
		}	
		return idArray ;
	}

	
}