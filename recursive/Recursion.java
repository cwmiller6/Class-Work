/**
* This program is practicing using recursive calls.
* It will use recursion to print the numbers 0-5
* @author Cole Miller
* @version 1.0
*/

public class Recursion
{

	public static void main(String[] args)
	{
	
		printNum(5);
	
	}
	
	public static void printNum (int n)
	{
		
		if (n==0)
		{
			System.out.println(n);
		}
		
		else
		{
			
			printNum(n-1);
			System.out.println(n);
		
		}
	}
}