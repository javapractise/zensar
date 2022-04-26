import java.util.*;
public class GuessGame{
	public static void main(String[] args)
	{
		//===================	To take input from user	===================
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] words = new String[n];
		for(int i=0 ; i < n ; i++)
		{
			words[i] = sc.next();
		}
		//========================================================================
		//===================	To process the game	===================
		if(checkGuess(words, n, sc))
		{
			System.out.println("Congrats you won the game");
		}
		else
		{
			System.out.println("Better Luck Next Time");
		}
		//========================================================================
	}
	// ===================	To process the game	===================
	public static boolean checkGuess(String[] words, int n, Scanner sc)
	{
		// max is for storing maximum odd length of word from given string
		// count to store no. of maximum odd length words from giev string
		int max = 0, count=0;
		for(int i=0 ; i < n; i++)
		{	
			// ---- to check the words whose length is odd ----
			if((words[i].length()) %2 != 0)
			{
				// ---- to take the max length from odd words ----
				if(words[i].length()>max)
				{	
					max = words[i].length();
					count++;	
				}	
			}
		}
		// if there is no any word with odd length
		if(count==0)
		{
			return false;
		}
		// create a array of length count to store the odd max length words
		String[] hidden = new String[count];
		int j=0;
		for(int i=0 ; i<n ; i++)
		{
			if(words[i].length() == max)
			{
				hidden[j] = words[i];
				j++;
			}
		}
		// Take the user's guess
		System.out.println("Enter your guess : ");
		String guess = sc.next();
		// compare the user's guess with computer's guess 
		// if guess is found then return true else return false
		if(hidden[0].equals(guess))
		{
			return true;
		}
		
		return false;
		
	}
	
	

	
}