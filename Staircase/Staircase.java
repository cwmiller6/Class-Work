/**
* This program will print a staricase of asterisks both regularly
* and upside down according to the user's input for n.
* @author Cole Miller
* @version 1.0
*/

import java.util.Scanner;

public class Staircase
{
	public static void main(String[] args)
	{
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Value of n: ");
	int n = keyboard.nextInt();

	up(n);
	System.out.println("        ");
	down(n);
	
	}

	public static void up(int n)
	{
		for(int i = n; i > 0; i --)
		{
			for(int p = 1; p <= i; p ++)
			{
				System.out.print("*");
			
			}
		System.out.println(); 
		
		}
	
	}

	public static void down(int n)
	{
	
		for(int i = 1; i <= n; i ++)
		{
			for(int p = 1; p <= i; p ++)
			{
				System.out.print("*");
			
			}
		System.out.println();
		}
	}
}