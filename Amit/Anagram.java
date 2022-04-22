// Anagram

import java.util.*;
class Anagram{
	public static void main(String[] args)
	{
		String str1 = "Listen";
		String str2 = "Silent";
		// To convert it in one case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		// To sort the given array of characters
		arr1 = sort(arr1);
		arr2 = sort(arr2);
		
		if(checkAnagram(arr1, arr2))
		{	
			System.out.println(str1+ " and "+str2+" are Anagram");	
		}
		else
		{	
			System.out.println(str1+ " and "+str2+" are NOT Anagram");	
		}
	}
	// To check the given strings are anagram or not
	public static boolean checkAnagram(char[] arr1 , char[] arr2)
	{
		if(arr1.length != arr2.length)
		{ 	
			return false;
		}
		for(int i=0 ; i<arr1.length; i++)
		{
			if(arr1[i]!=arr2[i])
			{
				return false;
			}
		}
		return true;
	}
	// To sort the given Array
	public static char[] sort(char[] arr)
	{
		char temp;
		for(int i=0 ; i<arr.length;i++)
		{
			for(int j=i+1 ; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{	
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
			}
		}
		return arr;
	}
}