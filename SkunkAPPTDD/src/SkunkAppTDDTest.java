import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SkunkAppTDDTest
{
	private Player playerOne;
	private Player playerTwo;
	private PlayGame game;
	@Before
	public void setUp() 
	{
		 playerOne = new Player("");
		 playerTwo = new Player("");
		 game = new PlayGame( playerOne, playerTwo);
	}

	
	@Test
	public void testCurrentPlayerIsPlayerOne()
	{		
		assertEquals(playerOne, game.CurrentPlayer());
	}
	
	@Test
	public void testfirstPlayer_TurnEnded()
	{
		game.EndTurn();
		assertEquals(playerTwo, game.CurrentPlayer());
	}
	
	@Test
	
	public void testIsOver()
	{
		Assert.assertFalse(game.isOver);
		
	}
	public void testIsOver_PlayerOneHas100Points()
    {
   	 playerOne.setScore(100);
   	 game.EndTurn();
   	 Assert.assertTrue(game.isOver);
   	 
    }

}

