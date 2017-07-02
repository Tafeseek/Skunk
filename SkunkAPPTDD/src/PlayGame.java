
public class PlayGame
{
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    
	public PlayGame(Player playerOne, Player playerTwo)
	{
		this.playerOne= playerOne;
		this.playerTwo = playerTwo;
		this.currentPlayer= playerOne;
		
	}
	public Player CurrentPlayer()
	{
		
		return currentPlayer;
	}
	public void EndTurn()
	{
       this.currentPlayer = this.currentPlayer.equals(playerOne)?playerTwo:playerOne;
		
	}
	

}
