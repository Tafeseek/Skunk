import java.util.Scanner;

public class SkunkApp
{
	private static Player playerOne = new Player("TAFESSE");
	private static Player playerTwo = new Player("ASHENAFI");
	private static PlayGame game = new PlayGame(playerOne, playerTwo);
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args)
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
			println("This turn's score is " + game.currentTurn().getScore() );
			println("Press enter to roll, q to end turn");
			String line = keyboard.nextLine();
			
			if (line.startsWith("q"))
			{
				game.bankAndEndTurn();
			} else
			{
				int roll = game.roll();
				println("You rolled a " + roll );
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
