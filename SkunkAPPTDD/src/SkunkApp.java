
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

	private static Player playerOne ;//= new Player("TAFESSE");
	private static Player playerTwo ;//= new Player("ERIC");
	private static GameController game;// = new GameController(playerOne, playerTwo);
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args)
	{
		
		displayPlayersInfo();

		run();
	}

	private static void displayPlayersInfo()
	{
		println("*****************************************");
		println("Welcome to the Skunk Game");

		System.out.print("Enter Two players name to start\n");
		println("*****************************************\n");
		//int numOfPlayers = Integer.parseInt(keyboard.nextLine());
	    
		//Create a string array to store the names of your players
		String arrayOfNames[] = new String[2];
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("Enter the name of players " + (i+1) + " : ");
		        arrayOfNames[i] = keyboard.nextLine();
		}

	playerOne = new Player(arrayOfNames[0]);
    playerTwo = new Player(arrayOfNames[1]);
    game = new GameController(playerOne, playerTwo);
	}

	private static void run()
	{
		System.out.println("");
//		System.out.println("Rules: \n\nroll - If the player rolls a \n\n1: the player "
//				+ "scores nothing and it becomes the opponent's turn. \n2 - 6: the number "
//				+ "is added to the player's turn total and the player's turn continues. "
//				+ "\n\nhold - pr "
//				+ "becomes the opponent's turn");

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
			println("Press enter to roll, and Press h to hold");
			String line = keyboard.nextLine();

			if (line.startsWith("h") || game.currentTurn().getScore() >= 100)
			{
				game.bankAndEndTurn();
			} else
			{
				int roll = game.roll();
				
			    println("your rolled : " + game.currentTurn().toString() + "\n current score:= "+ roll);
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
