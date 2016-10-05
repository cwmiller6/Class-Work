import java.util.Scanner; 

public class RiverGame {

	public static boolean cabb;
	public static boolean sheep;
	public static boolean wolf;
	public static boolean human;

	public static void main(String[] args){

		description();

		displayGameStatus();

		game();


	}

	public static void description(){

		System.out.println("Welcome to the River Game. You are given the task");
		System.out.println(" to bring 3 items across the river. The challenge is ");
		System.out.println("that if one item is left with another, one will be eaten.");
		System.out.println(" Play strategically and see how you can take a wolf, a sheep, ");
		System.out.println("and a cabbage across a river with only being allowed to take one on the boat at a time.");
		System.out.println(" The Wolf eats the sheep, the sheep eats the cabbage.");
		System.out.println("\n \n");
	}

	public static void displayGameStatus(){

		String bank0 = "   ";
		String bank1 = "   ";

		if (!cabb)
			bank0 += "C   ";
		else 
			bank1 += "C   ";


		if (!sheep)
			bank0 += "S   ";
		else 
			bank1 += "S   ";


		if (!wolf)
			bank0 += "W   ";
		else 
			bank1 += "W   ";


		if (!human)
			bank0 += "H   ";
		else 
			bank1 += "H   ";

		System.out.println(bank0);
		System.out.println("--------------------");
		System.out.println("\n \n \n");
		System.out.println("--------------------");
		System.out.println(bank1);
	}

public static int checkWinner()
	{
	
		if(cabb == false && sheep == false && human == true && wolf == true)
			return 2;
		else if(cabb == true && sheep == true && human == false && wolf == false)
			return 2;
		else if(cabb == false && sheep == true && human == false && wolf == true)
			return 3;
		else if(cabb == true && sheep == false && human == true && wolf == false)
			return 3;
		else if(cabb == true && sheep == true && human == true && wolf == true)
			return 4;
		else
			return 0;
	
	}

	public static void game(){
		
		Scanner keyboard = new Scanner(System.in);

		int game = 0;
		while (game == 0)
		{
			System.out.println("Which would you like to move... C, S, W, or H: ");
			String move = keyboard.nextLine();

			if (move.equals("quit"))
			{
				game = 1;
				System.out.println("See you later!");
			}
			else if (move.equals("H") || move.equals("h"))
				human = !human;
			else if (move.equals("C") || move.equals("c"))
			{
				if (cabb == true && human == true)
					{
					cabb = !cabb;
					human = !human;
					}
				else if (cabb == false && human == false)
					{
					cabb = !cabb;
					human = !human;
					}
				else
					System.out.println("The human has to be on the same side in order for you to move an item on that side");
			}	
			else if (move.equals("S") || move.equals("s"))
			{
				if (sheep == true && human == true)
					{
					sheep = !sheep;
					human = !human;
					}
				else if (sheep == false && human == false)
					{
					sheep = !sheep;
					human = !human;
					}
				else
					System.out.println("The human has to be on the same side in order for you to move an item on that side");
			}
			else if (move.equals("W") || move.equals("w"))
			{
				if (wolf == true && human == true)
					{
					wolf = !wolf;
					human = !human;
					}
				else if (wolf == false && human == false)
					{
					wolf = !wolf;
					human = !human;
					}
				else
					System.out.println("The human has to be on the same side in order for you to move an item on that side");
			}	
			
			displayGameStatus();
			
			game = checkWinner();
			
		}
		if (game == 2)
			System.out.println("The sheep ate the cabbage! You lose.");
		else if (game == 3)
			System.out.println("The wolf ate the sheep! You lose.");
		else if (game == 4)
			System.out.print("Nice job! Everything made it to the other side with no harm. You win!");
	}
}
		

