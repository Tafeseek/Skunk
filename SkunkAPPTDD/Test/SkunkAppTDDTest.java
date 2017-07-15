
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SkunkAppTDDTest
{

	private Player playerOne;
	private Player playerTwo;
	private GameController game;

	@Before
	public void setUp()
	{
		playerOne = new Player("Bonnie");
		playerTwo = new Player("Clyde");
		game = new GameController(playerOne, playerTwo);
	}

	@Test
	public void testCurrentPlayerIsPlayer1()
	{
		Assert.assertEquals(playerOne, game.currentPlayer());
	}

	@Test
	public void testStartNextTurn()
	{
		game.startNextTurn();
		Assert.assertEquals(playerTwo, game.currentPlayer());
	}

	@Test
	public void testIsOver_initial()
	{
		Assert.assertFalse(game.isOver());
	}

	@Test
	public void testIsOver_player1Has100Points()
	{
		playerOne.setScore(100);
		game.bankAndEndTurn();
		Assert.assertTrue(game.isOver());
	}

	@Test
	public void testGetWinner_player1Has100Points()
	{
		playerOne.setScore(100);
		game.bankAndEndTurn();
		Assert.assertEquals(playerOne, game.getWinner());
	}

	@Test(expected = IllegalStateException.class)
	public void testGetWinner_noWinner()
	{
		game.getWinner();
	}
}
