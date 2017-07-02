
public class PlayGame
{
    private Player playerOne;
    private Player playerTwo;
	public PlayGame(Player playerOne, Player playerTwo)
	{
		this.playerOne= playerOne;
		this.playerTwo = playerTwo;
		
	}

	public Player CurrentPlayer()
	{
		
		return playerOne;
	}
	

}
