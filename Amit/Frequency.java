// Frequency

import java.util.*;
class Frequency
{
	public static void main(String[] args)
	{
		String str = "Hello";
		char[] chr1 = str.toCharArray();
		int[] count = new int[str.length()];
		for(int i=0; i<str.length();i++)
		{
			count[i]=1;
			for(int j=i+1 ; j<str.length();j++)
			{
				if(chr1[i]==chr1[j])
				{
					count[i]++;
					chr1[j]='*';
				}
			}
		}
		
		for(int i=0 ; i<count.length;i++)
		{
			if(chr1[i] !=' ' && chr1[i] !='*')
			{
				System.out.println(chr1[i]+" = "+count[i]);
			}
		}
	}
}