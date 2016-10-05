/**
* This is a chatbot that talks back to you
* until you type in bye.
* @author Cole Miller
* @version 1.0
*/

import java.util.Scanner;

public class RealChatBot
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello! What is your name? ");
		String name = keyboard.nextLine();
		System.out.println("Hi " + name + "!");
		String response = ("");

		while(!response.equals("bye") && (!response.equals("Bye")))
		{

			System.out.println("Hmmm what should we talk about...what's your favorite color? ");
			response = keyboard.nextLine();
			if((response.equals ("blue")) || (response.equals("Blue")))
			{
				System.out.println("Hey my favorite color is blue also!");
			}
			else if((response.equals("yellow")) || (response.equals("Yellow")))
			{
				System.out.println("Your favorite color is yellow? That is my least favorite color.");
			}
			else
			{
				System.out.println(response + "? Cool! My favorite color is blue.");
			}
			System.out.println("Let's talk about tv shows. What's your favorite? ");
			response = keyboard.nextLine();
			if ((response.equals("the walking dead")) || (response.equals("The Walking Dead")))
			{
				System.out.println("Really? The Walking Dead is my favorite show too!");
			}
			else if((response.equals("game of thrones")) || (response.equals("Game of Thrones")))
			{
				System.out.println("Game of Thrones is my second favorite show! Winter is coming.");
			}
			else
			{
				System.out.print("Your favorite show is "+ response + "? Cool! My favorite show is the walking dead.");
			}
		}
	}
}

