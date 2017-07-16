
/*
 *  Skunk game is a  dice game in which two players 
 * race to reach 100 points.Each turn, a player repeatedly rolls a die until 
 * either a 1 is rolled or the player holds and scores the sum of the rolls 
 * (i.e. the turn total). At any time during a player's turn, 
 * the player is faced with two decisions: 
 * 
 *  roll -  If the player rolls a 
 *      1:      The player scores nothing and it becomes the opponent's turn. 
 *      2 - 6:  The number is added to the player's turn total and the player's 
 *              turn continues. 
 * hold -  The turn total is added to the player's score and it becomes the 
 * opponent's turn. 

 *
 */
import java.util.Scanner;

public class SkunkApp
{

	private static Player playerOne;
	private static Player playerTwo;
	private static GameController game;
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args)
	{

		displayPlayersInfo();

		run();
	}

	private static void displayPlayersInfo()
	{
		println("********************************************************************************");
		println("Welcome to the Skunk Game");
		println("Game Rules : \n" + 
		
		          "1.Press [Enter] to roll\n"+
				  "2.press [h] to to pass the turn to an oponent\n"
				+ "3.if players score>=100 press [h] to end the round game and declare a winner \n");
		
		

		println("*******************************************************************************\n");

		System.out.print("Enter Two players name to start\n");

		// int numOfPlayers = Integer.parseInt(keyboard.nextLine());

		// Create a string array to store the names of your players
		String playerName[] = new String[2];
		for (int i = 0; i < playerName.length; i++)
		{

			System.out.print("*  Enter the name of players " + (i + 1) + " : " + "\n");
			playerName[i] = keyboard.nextLine();
		}

		playerOne = new Player(playerName[0]);
		playerTwo = new Player(playerName[1]);
		game = new GameController(playerOne, playerTwo);
	}

	private static void run()
	{
		System.out.println("");

		System.out.print("\nPress [ENTER] to roll...\n");

		while (!game.isOver())
		{
			playOneRound();
		}
		printScores();
		println("Game over! The winner is " + game.getWinner().getName());
	}

	private static void playOneRound()
	{
		while (!game.currentTurn().isOver())
		{
			printScores();
			println("\nIt is " + game.currentPlayer().getName() + "'s turn");
			println("This turn's score is " + game.currentTurn().getScore());
			println("Press [Enter] to roll, and Press [h] to hold and pass the roll to an oponent ");
			String line = keyboard.nextLine();

			if (line.startsWith("h") || game.currentTurn().getScore() >= 100)
			{
				game.bankAndEndTurn();
			} else
			{
				int roll = game.roll();

				println("your rolled : " + game.currentTurn().toString() + "\ncurrent score is := " + roll);
			}
		}
		if (!game.isOver())
		{
			game.startNextTurn();
		}
	}

	private static void printScores()
	{
		println(playerOne.getName() + "'s score is " + playerOne.getScore());
		println(playerTwo.getName() + "'s score is " + playerTwo.getScore());
	}

	private static void println(String s)
	{
		System.out.println(s);
	}

}
