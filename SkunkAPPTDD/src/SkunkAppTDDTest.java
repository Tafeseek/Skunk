import static org.junit.Assert.*;

import org.junit.Test;

public class SkunkAppTDDTest
{
	@Test
	public void testCurrentPlayerIsPlayerOne()
	{
		Player playerOne = new Player();
		Player playerTwo = new Player();
		PlayGame game = new PlayGame( playerOne, playerTwo);
		assertEquals(playerOne, game.CurrentPlayer());
	}
	
	@Test
	public void testfirstPlayer_TurnEnded()
	{
		Player playerOne = new Player();
		 Player playerTwo = new Player();
		PlayGame game = new PlayGame( playerOne, playerTwo);
		game.EndTurn();
		assertEquals(playerTwo, game.CurrentPlayer());
	}

}
