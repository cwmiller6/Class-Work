/**
* This is a simulator version
* of the MontyHallGame. Only
* user input is number of times
* they wish to run the simulation.
* @author Cole Miller
* @version 1.0
*/

public class MontyHallSim {

	public static void main(String[] args){

		description();

		String input = args[0];
		
		int numSim = Integer.parseInt(input);
		System.out.println(numSim);
		
		int switchWin = 0;
		
		for(int i = 0; i < numSim; i++)
			switchWin += game();
		
		double percentSwitchWin = format ((double) switchWin / numSim * 100.0);
		double percentStayWin = format (100.0 - percentSwitchWin);
		System.out.println("% win rate when switching chosen door: " + percentSwitchWin);
		System.out.println("% win rate when staying with chosen door: " + percentStayWin);
	}

	public static void description(){

		System.out.println("Welcome to the Monty Hall Simulator!");
		System.out.println("There is a car hidden in one of the three doors.");
		System.out.print("Random simulations will be done and the result ");
		System.out.println("percentage will be displayed.");

	}

	public static double format(double d)
	{
		int temp = (int) (d * 100);
		return temp / 100.0;

	}

	public static int game(){

		int car = ((int) (Math.random() * 3 + 1));
		int userPick = ((int) (Math.random() * 3 + 1));
		
		if (car == userPick)
			return 0;
		else
			return 1;
	}
}