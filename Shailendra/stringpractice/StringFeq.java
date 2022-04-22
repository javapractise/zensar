package com.java.stringpractice;

public class StringFeq {

	public static void main(String[] args) {
	String s ="Life is fun and you have to Enjoy";
	int[] feq =new int[s.length()];
	
	char str[] =s.toCharArray();
	for(int i=0;i<str.length;i++)
	{
		feq[i] =1;
		for(int j=i+1;j<str.length;j++)
		{
			if(str[i]==str[j])
			{
				feq[i]++;
				str[j] ='0';
			}
		}
	}
	System.out.println("Ferquenices of the charcher in string");
for(int i=0;i<feq.length;i++)
{
	if(str[i] != ' ' && str[i] != '0')
System.out.println(str[i]+"       "+feq[i]);
	
}
	
	

	}

}
