
public class GameController
{
	private static  Die DIE = new RollDie();
	private static  int POINTS_TO_WIN = 100;

	private Player playerOne;
	private Player playerTwo;
	private Player winner;
	private boolean isOver = false;
	private Turn turn;

	public GameController(Player playerOne, Player playerTwo)
	{
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		this.turn = new Turn(playerOne, DIE,DIE);
	}

	public Player currentPlayer()
	{
		return turn.getPlayer();
	}

	public void bankAndEndTurn()
	{
		turn.end();
		if (currentPlayer().getScore() >= POINTS_TO_WIN)
		{
			this.winner = currentPlayer();
			this.isOver = true;
		}
	}

	public void startNextTurn()
	{
		turn = new Turn(nextPlayer(), DIE,DIE);
	}

	private Player nextPlayer()
	{
		return currentPlayer().equals(playerOne) ? playerTwo : playerOne;
	}

	public boolean isOver()
	{
		return isOver;
	}

	public Player getWinner()
	{
		if (!isOver())
		{
			throw new IllegalStateException("The game is not over");
		} else
		{
			return winner;
		}
	}

	public int roll()
	{
		return turn.roll();
	}

	public Turn currentTurn()
	{
		return turn;
	}
	
	
	
}
