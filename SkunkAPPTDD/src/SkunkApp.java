
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

	private static Player playerOne = new Player("TAFESSE");
	private static Player playerTwo = new Player("ERIC");
	private static GameController game = new GameController(playerOne, playerTwo);
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args)
	{

		run();
	}

	private static void run()
	{
		println("Welcome to the Game of SKUNK");

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
			println("Press enter to roll, h to hold");
			String line = keyboard.nextLine();

			if (line.startsWith("h") || game.currentTurn().getScore() >= 100)
			{
				game.bankAndEndTurn();
			} else
			{
				int roll = game.roll();
				println("You rolled a " + roll);
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
