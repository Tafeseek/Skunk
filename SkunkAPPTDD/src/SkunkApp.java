import java.util.Scanner;

public class SkunkApp
{
	private static Player playerOne;
	private static Player playerTwo;

	public static void main(String[] args)
	{
		playerOne = new Player("Tafesse");
		playerTwo = new Player("Ashenafi");
		PlayGame game = new PlayGame(playerOne, playerTwo);
		Scanner inputValue = new Scanner(System.in);

		System.out.print("Welcome to the Skunk Game \n");

		Turn turn = new Turn(playerOne,new RollDie());
		while (!game.isOver())
		{
			printScore();
			playOneRound(game);

			String line = inputValue.nextLine();
			if (line.startsWith("q"))
			{
				game.EndTurn();
			}

			else
			{
				game.roll();
			}

			printScore();
		}

		println("Game over! The winner is " + game.getWinner().getName());

	}

	private static void playOneRound(PlayGame game)
	{
		println("It is " + game.CurrentPlayer().getName() + "'s turn\n");
		println("This turn's score is " + game.currentTurn().getScore() + "\n");
		println("Press enter to roll, q to end turn\n");
	}

	private static void printScore()
	{
		println(playerOne.getName() + "'score is " + playerOne.getScore() + "\n");
		println(playerTwo.getName() + "'score is " + playerTwo.getScore() + "\n\n");
	}

	private static void println(String s)
	{
		System.out.print(s);
	}

}
