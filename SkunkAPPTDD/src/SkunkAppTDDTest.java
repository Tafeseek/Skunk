import static org.junit.Assert.*;

import org.junit.Test;

public class SkunkAppTDDTest
{

	@Test
	public void CurrentPlayGameTest()
	{
		Player player1 = new Player();
		 Player player2 = new Player();
		PlayGame game = new PlayGame( player1, player2);
		assertEquals(player1, game.CurrentPlayer());
	}

}
